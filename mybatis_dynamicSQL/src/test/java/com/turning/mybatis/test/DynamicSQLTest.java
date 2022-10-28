package com.turning.mybatis.test;

import com.turning.mybatis.mapper.DynamicSQLMapper;
import com.turning.mybatis.pojo.Emp;
import com.turning.mybatis.utlis.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, null, null,"男");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, null, null,"男");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testInsertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp88 = new Emp(54, "小明1", 20, "男");
        Emp emp99 = new Emp(632, "小明2", 20, "男");
        Emp emp100 = new Emp(77, "小明3", 20, "男");
        List<Emp> list = Arrays.asList(emp88, emp99, emp100);
        mapper.insertMoreEmp(list);

        sqlSession.close();
    }
    @Test
    public void testDeleteMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] ids = {54, 632, 77};
        mapper.deleteMoreEmps(ids);

        sqlSession.close();
    }
}
