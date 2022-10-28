package com.turning.mybatis.mapper;

import com.turning.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId")Integer deptId);
}
