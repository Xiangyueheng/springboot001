package com.accp.springboot001.pojo;

import java.util.Date;

public class Emp {
    private Integer empid;

    private String empname;

    private String empwork;

    private Double empprice;

    private Date empdate;

    private Double empjangjin;

    private Integer deptid;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpwork() {
        return empwork;
    }

    public void setEmpwork(String empwork) {
        this.empwork = empwork == null ? null : empwork.trim();
    }

    public Double getEmpprice() {
        return empprice;
    }

    public void setEmpprice(Double empprice) {
        this.empprice = empprice;
    }

    public Date getEmpdate() {
        return empdate;
    }

    public void setEmpdate(Date empdate) {
        this.empdate = empdate;
    }

    public Double getEmpjangjin() {
        return empjangjin;
    }

    public void setEmpjangjin(Double empjangjin) {
        this.empjangjin = empjangjin;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}