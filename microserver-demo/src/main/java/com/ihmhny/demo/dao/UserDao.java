package com.ihmhny.demo.dao;

import com.ihmhny.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaobei
 * @class_name UserDao
 * @date 2018-02-02 16:58
 * @description
 */
public interface UserDao {

    @Select("SELECT * FROM USER WHERE username = #{username}")
    User selectByParams(@Param("username") String username);

    @Insert("INSERT INTO USER(username, password) VALUES(#{username}, #{password})")
    int insertByParams(String name, String password);
}
