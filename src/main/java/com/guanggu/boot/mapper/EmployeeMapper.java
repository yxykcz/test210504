package com.guanggu.boot.mapper;

import com.guanggu.boot.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public  int insertEmp(Employee employee);
}
