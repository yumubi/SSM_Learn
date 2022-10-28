package com.turning.mybatis.mapper;

import com.turning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
        List<Emp> getEmpByCondition(Emp emp);
        List<Emp> getEmpByChoose(Emp emp);

        void insertMoreEmp(@Param("emps")List<Emp> emps);

        void deleteMoreEmps(@Param("empIds")Integer[] empIds);
}
