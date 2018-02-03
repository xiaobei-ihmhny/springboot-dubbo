package com.ihmhny.demo.exception;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 8:30
 * @since: JDK 1.8
 * @description: 自定义异常类型
 */
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}
