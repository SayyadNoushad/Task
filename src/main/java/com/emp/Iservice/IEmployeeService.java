package com.emp.Iservice;

import java.util.List;

import com.emp.Entity.Employee;


public interface IEmployeeService 
{
	
	public String addEmployee(Employee emp);
	
	
	public List<Employee>  getAllEmployee();
	
	
    public Employee findEmployee(int no) throws Exception;
	
	public String updateEmployee(Employee emp);
	
	
	public String deleteEmployee(int no);

}
