package com.ihmhny.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 14:55
 * @since: JDK 1.8
 * @description: 统一的日志处理切面
 */
@Component
@Aspect
//@Order(1)//定义当前切面的优先级，数值越小，优先级越大
public class WebLogAspect {

    private final Logger log = LoggerFactory.getLogger(WebLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    /**
     * 定义切入点
     */
    @Pointcut("execution(public * com.ihmhny.demo.web..*.*(..))")
    public void webLog() {}

    /**
     * 前置通知
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        //记录开始请求时间
        startTime.set(System.currentTimeMillis());
        //接收到的请求
        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //需要记录的内容：
        log.info("url: " + request.getRequestURL().toString());
        log.info("http_method: " + request.getMethod());
        log.info("class_method: " +
                joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        log.info("args: " + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     *
     * @param ret
     * @throws Throwable
     */
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        //处理完请求，返回内容
        log.info("response: " + ret);
        log.info("spend time: " + (System.currentTimeMillis() - startTime.get()) + "ms");
    }
}













