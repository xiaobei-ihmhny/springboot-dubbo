package com.ihmhny.demo.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 7:39
 * @since: JDK 1.8
 * @description: 用户模型
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String username;

    private String password;
}
