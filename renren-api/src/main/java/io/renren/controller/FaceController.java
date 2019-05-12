package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.service.FaceService;
import io.renren.vo.face.MergeFaceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.MutablePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/**
 * 旷视API
 *
 * @author sumeirui
 * @date 2019/5/11 11:01
 */
@Slf4j
@RestController
@RequestMapping("/face")
@Api(tags = "图片处理")
public class FaceController {

    @Autowired
    private FaceService faceService;

    public static final String IMG_PATH = "/static/img/";
    /**
     * 才，品，谱，型
     */
    private String[] imgUrls = new String[]{"temp1.jpg", "temp2.jpg", "temp3.jpg", "temp4.jpg"};

    @PostMapping("merge")
    @ApiOperation(value = "合成图片")
    public R mergeFace(@RequestParam(value = "srcFile", required = false) MultipartFile srcFile,
                       @RequestParam(value = "test", required = false, defaultValue = "false") boolean test,
                       @RequestParam(value = "index", required = false, defaultValue = "0") int index) {
        try {
            if (index >= imgUrls.length || index < 0) {
                return R.error("选择模板图片错误");
            }

            URL resource = FaceService.class.getClassLoader().getResource("");
            String path = resource.getPath() + IMG_PATH;
            String imgUrl = imgUrls[index];
            MutablePair<Integer, MergeFaceResult> pair = null;
            if (test) {
                // 测试
                File file = new File(path  + "src.jpg");
                pair = faceService.mergeFace(new File(path + imgUrl), file);
            } else {
                byte[] tempBuff = FaceService.getBytesFromFile(new File(path + imgUrl));
                byte[] srcBuff = FaceService.getBytesFromStream((FileInputStream) srcFile.getInputStream());
                pair = faceService.mergeFace(tempBuff, srcBuff);
            }
            if (pair.left != 0) {
                return R.error("上传的图片检测不到脸部");
            }
            return R.ok().put("url", pair.getRight().getImgUrl());
        } catch (Exception e) {
            log.error("Exception ", e);
            return R.error("上传的图片检测不到脸部");
        }
    }
}
