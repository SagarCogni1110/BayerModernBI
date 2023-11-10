package com.bayer.modern.bi.code.service;
import com.bayer.modern.bi.code.entity.Department;
import java.util.List;
public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    void deleteDepartmentById(Long departmentId);

    Department getDepartmentById(Long departmentId);


    Department updateDepartment(Department department);

}