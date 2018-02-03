package com.ihmhny.demo.async;

import com.ihmhny.pay.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 9:26
 * @since: JDK 1.8
 * @description: 测试异步调用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AsyncTest {

    @Autowired
    private Task task;

    private final Logger log = LoggerFactory.getLogger(AsyncTest.class);

    @Test
    public void test() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> taskOne = this.task.doTaskOne();
        Future<String> taskTwo = this.task.doTaskTwo();
        Future<String> taskThree = this.task.doTaskThree();

        while(true) {
            if(taskOne.isDone() && taskTwo.isDone() && taskThree.isDone()) {
                //等待三个任务执行完成后，退出循环
                break;
            }
            Thread.sleep(1000);
        }

        long end = System.currentTimeMillis();

        log.info("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}
