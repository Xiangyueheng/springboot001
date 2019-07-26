package com.accp.springboot001.biz;

import com.accp.springboot001.dao.EmpMapper;
import com.accp.springboot001.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-25 20:42
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpBiz {
    @Autowired
    private EmpMapper dao;
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public int deleteByPrimaryKey(Integer empid){
        return dao.deleteByPrimaryKey(empid);
    }
    public List<Emp> selectAllBydepid(Integer depid){
        return dao.selectAllBydepid(depid);
    }

    public  int selectAllCountBydepid(Integer depid){
        return dao.selectAllCountBydepid(depid);
    }

}
