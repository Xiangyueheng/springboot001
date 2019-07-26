package com.accp.springboot001.biz;

import com.accp.springboot001.dao.DeptMapper;
import com.accp.springboot001.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangyueheng
 * @create 2019-07-25 21:55
 */
@Service
public class DeptBiz {
    @Autowired
    private DeptMapper dao;
    public List<Dept> selectAll(){
        return dao.selectAll();
    }
}
