package io.renren.common.manager;

import io.renren.common.utils.ExceptionUtil;
import io.renren.common.utils.MailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sumeirui
 * @date 2019/5/12 20:53
 */
@Slf4j
@Service
public class NotifyManager {

    private static final ExecutorService pool = Executors.newFixedThreadPool(5);

    public void notify(Exception e) {
        pool.submit(() -> MailUtil.sendMail("异常信息", ExceptionUtil.getStackTrace(e)));
    }
}
