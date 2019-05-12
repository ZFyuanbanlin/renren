package io.renren.common.utils;

import io.renren.common.config.MailConfig;
import lombok.SneakyThrows;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.Properties;


/**
 * @author mario
 */
public class MailUtil {

    private static final String HOST = MailConfig.HOST;
    private static final Integer PORT = MailConfig.PORT;
    private static final String USERNAME = MailConfig.USERNAME;
    private static final String PASSWORD = MailConfig.PASSWORD;
    private static final String EMAILFORM = MailConfig.EMAILFORM;
    private static final String TIMEOUT = MailConfig.TIMEOUT;
    private static final String PERSONAL = MailConfig.PERSONAL;
    private static final String SUBJECT = MailConfig.SUBJECT;
    private static final String HTML = MailConfig.HTML;
    private static final String RECIPIENT = MailConfig.RECIPIENT;
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
        p.setProperty("mail.smtp.timeout", TIMEOUT);
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
     */
    @SneakyThrows
    public static void sendMail(String to, String subject, String html) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(EMAILFORM, PERSONAL);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);

        // 设置默认更多发送邮件地址
        to = to + "," + RECIPIENT;
        String[] receiverList = to.split(",");
        for (String receiver : receiverList) {
            messageHelper.setTo(receiver);
            mailSender.send(mimeMessage);
        }
    }

    @SneakyThrows
    public static void sendMail(String subject, String html) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(EMAILFORM, PERSONAL);
        // 设置默认更多发送邮件地址;
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
//      messageHelper.addAttachment("", new File(""));//附件

        String[] receiverList = RECIPIENT.split(",");
        for (String receiver : receiverList) {
            messageHelper.setTo(receiver);
            mailSender.send(mimeMessage);
        }
    }


    public static void main(String[] args) {
        sendMail("测试用", "你好，");
    }
}
