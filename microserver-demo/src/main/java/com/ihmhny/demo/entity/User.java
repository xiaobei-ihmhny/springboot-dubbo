package com.ihmhny.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 16:24
 * @since: JDK 1.8
 * @description: 用户信息
 */
@Data
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String password;
}