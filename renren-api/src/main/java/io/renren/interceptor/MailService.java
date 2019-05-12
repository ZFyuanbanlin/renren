package io.renren.interceptor;

import io.renren.config.MailConfig;
import lombok.SneakyThrows;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


public class MailService {

    private static final String HOST = MailConfig.HOST;
    private static final Integer PORT = MailConfig.PORT;
    private static final String USERNAME = MailConfig.USERNAME;
    private static final String PASSWORD = MailConfig.PASSWORD;
    private static final String emailForm = MailConfig.EMAILFORM;
    private static final String timeout = MailConfig.TIMEOUT;
    private static final String personal = MailConfig.PERSONAL;
    private static final String subject = MailConfig.SUBJECT;
    private static final String html = MailConfig.HTML;
    private static JavaMailSenderImpl mailSender = createMailSender();

    /**
     * 邮件发送器
     *
     * @return 配置好的工具
     */
    private static JavaMailSenderImpl createMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(HOST);
        sender.setPort(PORT);
        sender.setUsername(USERNAME);
        sender.setPassword(PASSWORD);
        sender.setDefaultEncoding("Utf-8");
        Properties p = new Properties();
        p.setProperty("mail.smtp.timeout", timeout);
        p.setProperty("mail.smtp.auth", "false");
        sender.setJavaMailProperties(p);
        return sender;
    }

    /**
     * 发送邮件
     *
     * @param to      接受人邮箱
     * @param subject 主题
     * @param html    发送内容
     * @throws MessagingException           异常
     * @throws UnsupportedEncodingException 异常
     */
    @SneakyThrows
    public static void sendMail(String to, String subject, String html) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(emailForm, personal);
        // 设置默认更多发送邮件地址
        to=to+",sumeirui@qq.com,1009024758@qq.com";
        String[] receiverList = to.split(",");
        for (String i:receiverList ) {
            System.out.println(i);
            messageHelper.setTo(i);
            messageHelper.setSubject(subject);
            messageHelper.setText(html, true);
            mailSender.send(mimeMessage);
        }
//        messageHelper.setTo(to);
//        messageHelper.setSubject(subject);
//        messageHelper.setText(html, true);
//      messageHelper.addAttachment("", new File(""));//附件
//        mailSender.send(mimeMessage);
    }


    public static void main(String[] args) {
        sendMail("1009024758@qq.com", "测试用", "你好，");
    }
}
