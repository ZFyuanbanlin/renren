package io.renren.common.utils;

import java.util.UUID;

/**
 * @author sumeirui
 * @date 2019/5/12 13:28
 */
public class IdUtil {

    /**
     * 得到指定数量的UUID，以数组的形式返回
     */
    public static String[] getUUID(int num) {

        if (num <= 0)
            return null;

        String[] uuidArr = new String[num];

        for (int i = 0; i < uuidArr.length; i++) {
            uuidArr[i] = getUUID32();
        }

        return uuidArr;
    }

    /**
     * 得到32位的uuid
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    /**
     * 得到32位的uuid
     */
    public static String genId() {
        return getUUID32();
    }
}
