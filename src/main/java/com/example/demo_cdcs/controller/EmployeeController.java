package com.example.demo_cdcs.controller;

import com.example.demo_cdcs.model.Employee;
import com.example.demo_cdcs.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    // Test
    @GetMapping("/")
    public String test(){
        return "test";
    }

    // API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }

    // API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id, employee);
    }

    // API delete employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return iEmployeeService.deleteEmployee(id);
    }

    // API lay danh sach
    @GetMapping("/list")
    public List<Employee> getAllEmployee(){
        return iEmployeeService.getAllEmployee();
    }
}
