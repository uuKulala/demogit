package com.example.demo_cdcs.service;

import com.example.demo_cdcs.model.Employee;

import java.util.List;

public interface IEmployeeService {
    // Ham them nhan viebn
    public Employee addEmployee(Employee employee);

    // Ham chinh sua thong tin nhan vien
    public Employee updateEmployee(long id, Employee employee);

    // Ham xoa nhan vien
    public boolean deleteEmployee(long id);

    // Ham lay ra danh sach nhan vien
    public List<Employee> getAllEmployee();

    // Ham lay ra 1 nhan vien
    public Employee getOneEmployee(long id);
}
