package com.ihmhny.demo.mapper;

import com.ihmhny.pay.domain.User;
import com.ihmhny.pay.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 9:56
 * @since: JDK 1.8
 * @description: 整合测试mybatis
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {

    private final Logger log = LoggerFactory.getLogger(MybatisTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatis() {
        userMapper.insert("xiaobei",28);
        User user = userMapper.findUserByName("xiaobei");
        log.info("查询到的User对象为：{}" + user);
    }
}
