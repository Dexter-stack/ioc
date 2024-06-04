package com.dexter.ioc.repository;

import com.dexter.ioc.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long> {  // pass in your entity and pry key type


    public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departName);


}
