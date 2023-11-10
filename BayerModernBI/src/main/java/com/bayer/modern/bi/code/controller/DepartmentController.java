package com.bayer.modern.bi.code.controller;
import com.bayer.modern.bi.code.entity.Department;
import com.bayer.modern.bi.code.service.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired(required = false)
    private DepartmentService departmentService;


    @PostMapping("/saveDepartment")

    public Department saveDepartment(
             @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllDepartments")

    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/getDepartmentById/{id}")

    public Department
    updateDepartment(
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.getDepartmentById(
                departmentId);
    }

    @DeleteMapping("/deleteDepartmentById/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
    @PutMapping("/updateDepartmentById")
    public String updateDepartmentById(@RequestBody Department department)
    {
        departmentService.updateDepartment(department);
        return "Updated Successfully";
    }

}