package com.ncit.springboot_test.service;

import com.ncit.springboot_test.entity.Emp;

import java.util.List;

public interface EmpService {
    void addEmp(Emp emp);

    List<Emp> getAllEmp();
}
