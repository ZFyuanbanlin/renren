package io.renren.interceptor;

import io.renren.common.utils.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 描述：
 * 日志切面
 *
 * @author sumeirui
 * @date 2019-03-12 10:13
 */
@Slf4j
@Aspect
@Component
public class WebLogAspect {


    @Pointcut("execution( * io.renren.controller..*.*(..))")//两个..代表所有子目录，最后括号里的两个..代表所有参数
    public void logPointCut() {
    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        try {
            log.info("请求开始 请求IP:{},请求地址:{},方法:{},参数名:{},参数值:{}"
                    , IpUtils.getIpAddr(request)
                    , request.getRequestURL().toString()
                    , joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                    , ((CodeSignature) joinPoint.getSignature()).getParameterNames()
                    , Arrays.toString(joinPoint.getArgs())
            );
        } catch (Exception e) {
            log.error("请求开始 ", e);
        }
    }

    /**
     * returning的值和doAfterReturning的参数名一致
     */
    @AfterReturning(returning = "obj", pointcut = "logPointCut()")
    public void doAfterReturning(JoinPoint joinPoint, Object obj) {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        try {
            log.info("请求结束 请求IP:{},请求地址:{},方法:{},参数名:{},参数值:{},返回值:{}"
                    , IpUtils.getIpAddr(request)
                    , request.getRequestURL().toString()
                    , joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                    , ((CodeSignature) joinPoint.getSignature()).getParameterNames()
                    , Arrays.toString(joinPoint.getArgs())
                    , obj);
        } catch (Exception e) {
            log.error("请求结束 ", e);
        }
    }

    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        // ob 为方法的返回值
        Object ob = pjp.proceed();
        log.info("耗时 : " + (System.currentTimeMillis() - startTime) + "ms");
        return ob;
    }

}

