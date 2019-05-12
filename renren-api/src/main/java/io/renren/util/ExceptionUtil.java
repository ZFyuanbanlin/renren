package io.renren.util;

public class ExceptionUtil {

    /**
     * 获取异常的堆栈信息
     * 
     * @param t
     * @return
     */
    public static String getStackTrace(Throwable e) {
        StringBuffer messsage = new StringBuffer();
        if (e != null) {
            messsage.append(e.getClass()).append(": ").append(e.getMessage()).append("\r\n<br/>");
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement stackTraceElement : elements) {
                messsage.append("\t").append(stackTraceElement.toString()).append("\r\n<br/>");
            }
        }
        return messsage.toString();
    }
}
