package com.ihmhny.demo.service;

import com.ihmhny.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaobei
 * @class_name UserService
 * @date 2018-02-02 16:22
 * @description
 */
public interface UserService {

    User selectByParams(String username);

    int insertByParams(String name, String password);
}
