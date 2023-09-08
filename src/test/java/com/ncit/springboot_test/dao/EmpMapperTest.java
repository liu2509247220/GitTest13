package com.ncit.springboot_test.dao;

import com.ncit.springboot_test.entity.Dept;
import com.ncit.springboot_test.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
@SpringBootTest    //  单元测试类上方要加@SpringBootTest    ，这样才会帮你初始化容器
class EmpMapperTest {

    @Autowired
    private EmpDao empMapper;

    @Test
    void insertEmp() {

        Emp emp = new Emp();
        emp.setEname("zmj");
        emp.setJob("研发");
        emp.setHireDate(new Date());

        Dept dept = new Dept();
        dept.setId(10);
        dept.setDeptName("研发部");
        dept.setLoc("南京");

        emp.setDept(dept);
        empMapper.insertEmp(emp);
    }
}