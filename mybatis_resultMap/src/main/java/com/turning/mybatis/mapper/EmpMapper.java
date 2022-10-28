package com.turning.mybatis.mapper;

import com.turning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId")Integer empId);

    Emp getEmpAndDeptByStep(@Param("empId")Integer empId);
}
