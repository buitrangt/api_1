package com.example.api_3;

// DepartmentController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/")
    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }
}