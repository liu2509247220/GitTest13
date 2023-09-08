package com.ncit.springboot_test.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dept implements Serializable {
    private  Integer id;
    private  String deptName;
    private  String loc;
    private  List<Emp> empList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
