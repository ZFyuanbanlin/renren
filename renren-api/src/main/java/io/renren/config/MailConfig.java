package io.renren.config;

public class MailConfig {
    public static String HOST = "smtp.qq.com";              //服务器
    public static Integer PORT = 25;                         //端口号
    public static String USERNAME = "1009024758@qq.com";        //邮箱账号
    public static String PASSWORD = "rdpnjgnlwcyubcgc";         //邮箱授权码
    public static String EMAILFORM = "zf1009024758@foxmail.com"; //发送邮箱
    public static String TIMEOUT = "25000";                    //时间延迟
    public static String PERSONAL = "cinfo";                    //发件人
    public static String HTML = "错误信息";                  //内容模板
    public static String SUBJECT = "cinfo信息:";                //主题
    public static final String RECEIVER = "xxxqq.com,sumeirui@qq.com";


    /**
     * 初始化
     */
    private static void init() {
//        properties = new Properties();
//        try{
//            InputStream inputStream = MailConfig.class.getClassLoader().getResourceAsStream(PROPERTIES_DEFAULT);
////          properties.load(inputStream);
////          inputStream.close();
//            //解决中文乱码，采取reader把inputStream转换成reader用字符流来读取中文
//            BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
//            properties.load(bf);
//            host = properties.getProperty("mailHost");
//            port = Integer.parseInt(properties.getProperty("mailPort"));
//            userName = properties.getProperty("mailUsername");
//            passWord = properties.getProperty("mailPassword");
//            emailForm = properties.getProperty("mailFrom");
//            timeout = properties.getProperty("mailTimeout");
//            personal = properties.getProperty("personal");
//            html = properties.getProperty("html");
//            subject = properties.getProperty("subject");
//        } catch(IOException e){
//            e.printStackTrace();
//        }
    }
}
