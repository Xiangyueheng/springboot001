package com.accp.springboot001.dao;

import com.accp.springboot001.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Emp record);

    int insertSelective(Emp record);
    List<Emp> selectAllBydepid(@Param("depid") Integer depid);
    int selectAllCountBydepid(@Param("depid") Integer depid);
    Emp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}