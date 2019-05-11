package io.renren.service;

import com.alibaba.fastjson.JSON;
import io.renren.config.ImgConfig;
import io.renren.consts.StateConsts;
import io.renren.vo.face.DetectResult;
import io.renren.vo.face.MergeFaceResult;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.net.ssl.SSLException;

/**
 * 旷视API，主要是图片处理
 * 网站： https://console.faceplusplus.com.cn/dashboard
 *
 * @author mario
 * @date 2019/5/4 21:57
 */
@Slf4j
@Service
public class FaceService {

    private static final String API_KEY = "t7ATTnZ0--ip4zshj-wF-xLnityHHpgu";
    private static final String API_SECRET = "FEXs-IsZm4owFvehJwdMtdlEiLJymAVF";
    private final static int CONNECT_TIME_OUT = 30000;
    private final static int READ_OUT_TIME = 50000;
    private static String boundaryString = getBoundary();
    /**
     * 脸部检查API
     */
    public static final String DETECT_URL = "https://api-cn.faceplusplus.com/facepp/v3/detect";
    /**
     * 脸部合成API
     */
    public static final String MERGE_FACE_URL = "https://api-cn.faceplusplus.com/imagepp/v1/mergeface";


    /**
     * 获取图片人脸特征
     * https://console.faceplusplus.com.cn/documents/4888373
     *
     * @param file
     * @return
     */
    @SneakyThrows
    public static DetectResult detect(File file) {
        byte[] srcBuff = getBytesFromFile(file);
        return detect(srcBuff);
    }

    /**
     * 获取图片人脸特征
     *
     * @param buffer
     * @return
     */
    @SneakyThrows
    public static DetectResult detect(byte[] buffer) {
        HashMap<String, byte[]> byteMap = new HashMap<>(16);
        HashMap<String, String> map = getRequestMap(null);
        byteMap.put("image_file", buffer);
        byte[] post = post(DETECT_URL, map, byteMap);
        return JSON.parseObject(new String(post), DetectResult.class);
    }

    /**
     * 换脸，用户的脸到模板上
     * 1）先对源文件找到脸部特征点
     * 2）再替换模板的脸部
     * https://console.faceplusplus.com.cn/documents/20813963
     *
     * @param srcFile      源文件
     * @param templateFile 模板文件
     * @return
     */
    public MutablePair<Integer, MergeFaceResult> mergeFace(File templateFile, File srcFile) {
        byte[] srcBuff = getBytesFromFile(srcFile);
        byte[] tempBuff = getBytesFromFile(templateFile);
        HashMap<String, String> map = getRequestMap(null);
        try {
            // 获取图片特征
            DetectResult detectResult = detect(tempBuff);
            if (detectResult.getFaces().isEmpty()) {
                return new MutablePair<>(StateConsts.FAIL, null);
            }
            DetectResult.FacesBean.FaceRectangleBean faceRectangle = detectResult.getFaces().get(0).getFace_rectangle();
            map.put("template_rectangle", faceRectangle.getTop() + "," + faceRectangle.getLeft() + "," + faceRectangle.getWidth() + "," + faceRectangle.getHeight());

            HashMap<String, byte[]> byteMap = new HashMap<>(16);
            byteMap.put("template_file", tempBuff);
            byteMap.put("merge_file", srcBuff);
            // TODO 这里可以抽出一个换脸方法
            byte[] post = post(MERGE_FACE_URL, map, byteMap);
            MergeFaceResult mergeFaceResult = JSON.parseObject(new String(post), MergeFaceResult.class);
            if (mergeFaceResult.getResult() == null) {
                return new MutablePair<>(StateConsts.FAIL, null);
            }
            // 图片二进制文件
            String url = saveBase64ImageStringToImage(ImgConfig.IMG_PATH, String.valueOf(System.currentTimeMillis()), mergeFaceResult.getResult());
            mergeFaceResult.setResult("");
            mergeFaceResult.setImgUrl(ImgConfig.IMG_PRE + url);
            return new MutablePair<>(StateConsts.SUCC, mergeFaceResult);
        } catch (Exception e) {
            log.error("mergeFace ", e);
        }
        return null;
    }

    /**
     * 请求的map参数
     *
     * @param map
     * @return
     */
    private static HashMap getRequestMap(HashMap map) {
        if (map == null) {
            map = new HashMap<>(16);
        }
        map.put("api_key", API_KEY);
        map.put("api_secret", API_SECRET);
        map.put("return_landmark", "1");
        map.put("return_attributes", "gender,age,smiling,headpose,facequality,blur,eyestatus,emotion,ethnicity,beauty,mouthstatus,eyegaze,skinstatus");
        return map;
    }


    protected static byte[] post(String url, HashMap<String, String> map, HashMap<String, byte[]> fileMap) throws Exception {
        HttpURLConnection conne;
        URL url1 = new URL(url);
        conne = (HttpURLConnection) url1.openConnection();
        conne.setDoOutput(true);
        conne.setUseCaches(false);
        conne.setRequestMethod("POST");
        conne.setConnectTimeout(CONNECT_TIME_OUT);
        conne.setReadTimeout(READ_OUT_TIME);
        conne.setRequestProperty("accept", "*/*");
        conne.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundaryString);
        conne.setRequestProperty("connection", "Keep-Alive");
        conne.setRequestProperty("user-agent", "Mozilla/4.0 (compatible;MSIE 6.0;Windows NT 5.1;SV1)");
        DataOutputStream obos = new DataOutputStream(conne.getOutputStream());
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry) iter.next();
            String key = entry.getKey();
            String value = entry.getValue();
            obos.writeBytes("--" + boundaryString + "\r\n");
            obos.writeBytes("Content-Disposition: form-data; name=\"" + key
                    + "\"\r\n");
            obos.writeBytes("\r\n");
            obos.writeBytes(value + "\r\n");
        }
        if (fileMap != null && fileMap.size() > 0) {
            Iterator fileIter = fileMap.entrySet().iterator();
            while (fileIter.hasNext()) {
                Map.Entry<String, byte[]> fileEntry = (Map.Entry<String, byte[]>) fileIter.next();
                obos.writeBytes("--" + boundaryString + "\r\n");
                obos.writeBytes("Content-Disposition: form-data; name=\"" + fileEntry.getKey()
                        + "\"; filename=\"" + encode(" ") + "\"\r\n");
                obos.writeBytes("\r\n");
                obos.write(fileEntry.getValue());
                obos.writeBytes("\r\n");
            }
        }
        obos.writeBytes("--" + boundaryString + "--" + "\r\n");
        obos.writeBytes("\r\n");
        obos.flush();
        obos.close();
        InputStream ins = null;
        int code = conne.getResponseCode();
        try {
            if (code == 200) {
                ins = conne.getInputStream();
            } else {
                ins = conne.getErrorStream();
            }
        } catch (SSLException e) {
            e.printStackTrace();
            return new byte[0];
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[4096];
        int len;
        while ((len = ins.read(buff)) != -1) {
            baos.write(buff, 0, len);
        }
        byte[] bytes = baos.toByteArray();
        ins.close();
        return bytes;
    }

    private static String getBoundary() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 32; ++i) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-".charAt(random.nextInt("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_".length())));
        }
        return sb.toString();
    }

    private static String encode(String value) throws Exception {
        return URLEncoder.encode(value, "UTF-8");
    }

    public static byte[] getBytesFromFile(File f) {
        if (f == null) {
            return null;
        }
        try {
            FileInputStream stream = new FileInputStream(f);
            ByteArrayOutputStream out = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = stream.read(b)) != -1) {
                out.write(b, 0, n);
            }
            stream.close();
            out.close();
            return out.toByteArray();
        } catch (IOException e) {
            log.error("getBytesFromFile ", e);
        }
        return null;
    }

    public static String saveBase64ImageStringToImage(String directory, String baseName, String base64ImageString) throws IOException {
        // 图片的格式为 data:image/png;base64,iVBORw0KGgoAAAA...
        // 逗号的前面为图片的格式，逗号后们为图片二进制数据的 Base64 编码字符串
//        int commaIndex = base64ImageString.indexOf(",");
//        String extension = base64ImageString.substring(0, commaIndex).replaceAll("data:image/(.+);base64", "$1");
        byte[] content = Base64.decodeBase64(base64ImageString);
        String url = baseName + ".jpg";
        File file = new File(directory, url);
        FileUtils.writeByteArrayToFile(file, content);
        return url;
    }

    public static void main(String[] args) throws Exception {
        URL resource = FaceService.class.getClassLoader().getResource("");
        String path = resource.getPath();
        File srcFile = new File(path + "/static/img/th1.jpg");
        File templateFile = new File(path + "/static/img/th1.jpg");
//        mergeFace(templateFile, srcFile);
    }
}
