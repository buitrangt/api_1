package com.example.api_3;

// EmployeeController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
