package com.guanggu.boot.controller;


import com.guanggu.boot.bean.Department;
import com.guanggu.boot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {


    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id")  Integer id){
        return departmentMapper.getDepartmentById(id);
    }


    @GetMapping("/dept")
    public Department insertDept(Department department){
        System.out.println(department);
         departmentMapper.insertDepartment(department);
        return department;
    }




}
