package com.ihmhny.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 9:01
 * @since: JDK 1.8
 * @description: 定时任务示例
 */
@Component
public class ScheduledTasks {

    //记录日志
    private final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 创建定时任务，每5s执行一次
     */
    // 其他简单用法如下：
    // @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
    // @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
    // @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
    // @Scheduled(cron="*/5 * * * * *") ：通过cron表达式定义规则
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("现在时间是：{}", dataFormat.format(new Date()));
    }

}
