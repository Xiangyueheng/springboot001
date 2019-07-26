package com.accp.springboot001.pojo;

public class Dept {
    private Integer deptid;

    private String deptname;

    private String deptaddress;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptaddress() {
        return deptaddress;
    }

    public void setDeptaddress(String deptaddress) {
        this.deptaddress = deptaddress == null ? null : deptaddress.trim();
    }
}