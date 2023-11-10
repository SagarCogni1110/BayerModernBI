package com.bayer.modern.bi.code.repository;
import com.bayer.modern.bi.code.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department,
                                Long departmentId);
    void deleteDepartmentById(Long departmentId);
    Department findDepartmentById(Long departmentId);
}