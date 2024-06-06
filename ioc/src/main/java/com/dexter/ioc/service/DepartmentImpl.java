package com.dexter.ioc.service;

import com.dexter.ioc.entity.Department;
import com.dexter.ioc.error.DepartmentBadRequestException;
import com.dexter.ioc.error.DepartmentNotFoundExeception;
import com.dexter.ioc.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department)  {
        return departmentRepository.save(department);

    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExeception {

        Optional<Department> department =  departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new DepartmentNotFoundExeception("Department Not Available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        Department departmentDb = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            departmentDb.setDepartmentName(department.getDepartmentName());

        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            departmentDb.setDepartmentCode(department.getDepartmentCode());

        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            departmentDb.setDepartmentAddress(department.getDepartmentAddress());

        }
        return departmentRepository.save(departmentDb);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
       // return departmentRepository.findByDepartmentName(departmentName);
        return  departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }


}
