package com.yumubi.mybatis.test;

import com.yumubi.mybatis.mapper.SpecialMapper;
import com.yumubi.mybatis.pojo.User;
import com.yumubi.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialMapperTest {
    @Test
    public void testGetUserLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> list = mapper.getUserByLike("o");
        list.forEach(System.out::println);
    }
    @Test
    public void deleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        mapper.deleteMoreUser("5,6");

    }
    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null, "xiaoming", "123456", 24, "男", "453@163.com");
        mapper.insertUser(user);
        System.out.println(user);

    }
}
