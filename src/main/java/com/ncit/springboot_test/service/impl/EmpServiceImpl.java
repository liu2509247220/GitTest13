package com.ncit.springboot_test.service.impl;

import com.ncit.springboot_test.dao.EmpDao;
import com.ncit.springboot_test.entity.Emp;
import com.ncit.springboot_test.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;


    @Override
    public void addEmp(Emp emp) {
        empDao.insertEmp(emp);
    }

    @Override
    public List<Emp> getAllEmp() {
        return empDao.selectAllEmp();
    }
}
