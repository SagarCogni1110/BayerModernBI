package com.bayer.modern.bi.code.repository;

import com.bayer.modern.bi.code.entity.Department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DepartmentRepositoryImpl implements DepartmentRepository{

    static Department d1 = new Department(100001L,"Finance","New York US","NY100001AF");
    static Department d2 = new Department(100002L,"Accounts","Delhi India","DE100002RS");
    static Department d3 = new Department(100003L,"Technology","California US","CA100003JN");
    static Department d4 = new Department(100004L,"Human Resource","Winden Germany","GE100004MS");
    static Department d5 = new Department(100005L,"Talent Acquisition","Abu Dhabi UAE","AD100005FM");
    static Department d6 = new Department(100006L,"Admin","New Jersey US","NJ100006EM");
    static Department d7 = new Department(100007L,"Security","New York US","NY100007JW");
    static Department d8 = new Department(100008L,"Data Security","Mumbai India","MU100008AR");
    static Department d9= new Department(100009L,"Asset Management","Sydney Australia","SY100009PR");
    static Department d10 = new Department(100010L,"Architecture","Delhi India","DE100010MR");

    static  public List<Department> departmentList = new ArrayList<>(Arrays.asList(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10));

    @Override
    public Department saveDepartment(Department departmentL){
        this.departmentList.add(departmentL);
        return this.departmentList.get(this.departmentList.size()-1);
    }
    @Override
    public List<Department> fetchDepartmentList(){
        return this.departmentList;
    }
    @Override
    public Department updateDepartment(Department department,
                                                         Long departmentId){
        for(Department department1:departmentList)
        {
            if(Objects.equals(department1.getDepartmentId(), departmentId))
            {
                department1.setDepartmentName(department.getDepartmentName());
                department1.setDepartmentAddress(department.getDepartmentAddress());
                department1.setDepartmentCode(department.getDepartmentCode());
            }
        }
        return departmentList.stream().filter(d-> Objects.equals(d.getDepartmentId(), departmentId)).collect(Collectors.toList()).get(0);
    }
    @Override
    public void deleteDepartmentById(Long departmentId){
        departmentList.removeIf(department1 -> Objects.equals(department1.getDepartmentId(), departmentId));
    }
    @Override
    public Department findDepartmentById(Long departmentId){
        return departmentList.stream().filter(d-> Objects.equals(d.getDepartmentId(), departmentId)).collect(Collectors.toList()).get(0);
    }

}
