package com.emp.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.Iservice.IEmployeeService;
import com.emp.Repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements IEmployeeService
{
	
	@Autowired
	private  EmployeeRepository repository;

	@Override
	public String addEmployee(Employee emp)
	{
	
		
	Integer id=repository.save(emp).getEmpno();
		    
		 
		return "Employee save haveing Employee No::"+id;
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		
	
	
	
		return repository.findAll();
	}
	
	
	
	@Override
	public Employee findEmployee(int no) throws Exception 
	{
		Employee emp=repository.findById(no).orElseThrow(()->new IllegalAccessException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) 
	{
		Employee emp1=repository.save(emp);
				
				
		return "Employee is Updated with Having id value is::"+emp1.getEmpno();
	}

	@Override
	public String deleteEmployee(int no) 
	{
		Optional<Employee>em  =repository.findById(no);
		
		
		if(em.isPresent())
		{
			repository.deleteById(no);;;
			return "employee is deleted"+no;
		}
		return "employee with not found::"+no;
	}




}
