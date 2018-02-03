package com.ihmhny.demo.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 8:28
 * @since: JDK 1.8
 * @description: 错误统一的封装类
 */
@Getter
@Setter
public class ErrorInfo<T> {

    public static final Integer OK = 200;

    public static final Integer ERROR = 500;

    private Integer code;

    private String message;

    private String url;

    private T data;
}
