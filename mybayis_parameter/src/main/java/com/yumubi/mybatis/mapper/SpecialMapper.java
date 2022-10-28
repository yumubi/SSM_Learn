package com.yumubi.mybatis.mapper;

import com.yumubi.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialMapper {
    List<User> getUserByLike(@Param("mohu")String mohu);

    void deleteMoreUser(@Param("ids")String ids);

    List<User> getUserList(@Param("tableName")String tableName);

    void insertUser(User user);
}
