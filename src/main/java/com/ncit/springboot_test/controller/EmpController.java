package com.ncit.springboot_test.controller;

import com.ncit.springboot_test.entity.Emp;
import com.ncit.springboot_test.service.EmpService;
import com.ncit.springboot_test.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/addEmp")
    public String addEmp(Emp emp){
        empService.addEmp(emp);

        return "redirect:/toEmp";
    }

    @GetMapping("/toEmp")
    public  String toEmp(Model model){
        // 先去获取员工列表
        List<Emp> empList =  empService.getAllEmp();
        model.addAttribute("empList", empList);

        //todo  查询部门信息,放到model中

        return "emp";
    }

    @ResponseBody
    @GetMapping("/getEmp")
    public List<Emp>  getEmp(){
        List<Emp> empList =  empService.getAllEmp();
        return empList;
    }


}
