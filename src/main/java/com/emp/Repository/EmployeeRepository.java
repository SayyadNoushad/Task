package com.emp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> 
{

}
