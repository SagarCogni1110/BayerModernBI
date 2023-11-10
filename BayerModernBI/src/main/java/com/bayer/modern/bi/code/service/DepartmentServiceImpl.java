package com.bayer.modern.bi.code.service;
import com.bayer.modern.bi.code.entity.Department;
import com.bayer.modern.bi.code.repository.DepartmentRepository;
import java.util.List;
import java.util.Objects;

import com.bayer.modern.bi.code.repository.DepartmentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl
        implements DepartmentService {

    @Autowired(required = false)
    private final DepartmentRepository departmentRepository= new DepartmentRepositoryImpl();

    @Override
    public Department saveDepartment(Department department)
    {
        return departmentRepository.saveDepartment(department);
    }

    @Override public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
                departmentRepository.fetchDepartmentList();
    }

    @Override
    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteDepartmentById(departmentId);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findDepartmentById(departmentId);    }


    @Override
    public Department
    updateDepartment(Department department)
    {

        Department depDB
                = departmentRepository.findDepartmentById(department.getDepartmentId());


        if (Objects.nonNull(department.getDepartmentName())
                && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                    department.getDepartmentName());
        }

        if (Objects.nonNull(
                department.getDepartmentAddress())
                && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                    department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode())
                && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                    department.getDepartmentCode());
        }
        return departmentRepository.saveDepartment(depDB);
    }
}