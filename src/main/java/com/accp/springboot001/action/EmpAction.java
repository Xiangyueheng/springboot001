package com.accp.springboot001.action;

import com.accp.springboot001.biz.DeptBiz;
import com.accp.springboot001.biz.EmpBiz;
import com.accp.springboot001.pojo.Dept;
import com.accp.springboot001.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiangyueheng
 * @create 2019-07-25 21:58
 */
@RestController
@RequestMapping("/c")
public class EmpAction {
    @Autowired
    private EmpBiz empBiz;
    @Autowired
    private DeptBiz deptBiz;
    @RequestMapping("/dept/selectdept")
    public List<Dept> selectalldept(){
        return deptBiz.selectAll();
    }

    @RequestMapping("/dept/selectempbyid")
    public List<Emp> selectByempbydepid(int detpid){
        return empBiz.selectAllBydepid(detpid);
    }
    @RequestMapping("/dept/selectcount")
    public int selectcount(int detpid){
        return empBiz.selectAllCountBydepid(detpid);
    }

    @RequestMapping("/dept/delete")
    public Map<String,String> delete(int detpid, int empid){
        Map<String,String> map=new HashMap<String, String>();
        empBiz.deleteByPrimaryKey(empid);
        empBiz.selectAllCountBydepid(detpid);
        int rs = empBiz.selectAllCountBydepid(detpid);
        map.put("code","200");
        map.put("rs",rs+"");
        return map;
    }
}
