package com.ihmhny.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: xiaobei
 * @createTime: 2018-02-02 16:24
 * @since: JDK 1.8
 * @description: 用户信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;
}