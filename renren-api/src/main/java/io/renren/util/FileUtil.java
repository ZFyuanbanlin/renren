package io.renren.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

/**
 * @author sumeirui
 * @date 2019/5/12 16:18
 */
@Slf4j
public class FileUtil {

    /**
     * 获取文件的文件流
     *
     * @param pathFileName
     * @return
     */
    public static byte[] getData(String pathFileName) {
        byte[] buff = new byte[]{};
        ClassPathResource cpr = new ClassPathResource(pathFileName);
        try {
            buff = FileCopyUtils.copyToByteArray(cpr.getInputStream());
        } catch (Exception e) {
            log.error("IOException", e);
        }
        return buff;
    }
}
