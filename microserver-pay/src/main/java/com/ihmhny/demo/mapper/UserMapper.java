package com.ihmhny.demo.mapper;

import com.ihmhny.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.*;

/**
 * @author: xiaobei
 * @createTime: 2018-02-03 9:52
 * @since: JDK 1.8
 * @description: User映射类
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user WHERE name = #{name}")
    User findUserByName(@Param("name") String name);

    @Insert("INSERT INTO t_user(name,age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
