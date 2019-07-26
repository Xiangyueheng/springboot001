package com.accp.springboot001;

import com.accp.springboot001.biz.DeptBiz;
import com.accp.springboot001.biz.EmpBiz;
import com.accp.springboot001.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot001ApplicationTests {
    @Autowired
    private EmpBiz empBiz;
    @Autowired
    private DeptBiz deptBiz;
    @Test
    public void contextLoads() {
//        empBiz.deleteByPrimaryKey(81);
        List<Dept> depts = deptBiz.selectAll();
        for (Dept dept : depts) {
            System.out.println(dept);
        }
    }

}
