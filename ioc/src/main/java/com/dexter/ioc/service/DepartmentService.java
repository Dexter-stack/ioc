package com.dexter.ioc.service;

import com.dexter.ioc.entity.Department;
import com.dexter.ioc.error.DepartmentBadRequestException;
import com.dexter.ioc.error.DepartmentNotFoundExeception;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department) ;
    public List<Department> fetchDepartmentList();
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExeception;
    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartment(Long departmentId, Department department);
    public Department fetchDepartmentByName(String departmentName);


}
