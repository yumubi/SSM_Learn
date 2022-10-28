package com.turning.mybatis.mapper;

import com.turning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpById(@Param("empId")Integer empId);

    void InsertEmp(Emp emp);
}
