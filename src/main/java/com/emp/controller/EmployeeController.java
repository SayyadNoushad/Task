package com.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.emp.Entity.Employee;
import com.emp.Iservice.IEmployeeService;


@Controller

public class EmployeeController 
{
	@Autowired
	private IEmployeeService  employeeService;
	
	
	@GetMapping("/")
	public String  homePage()
	{
		return "home";
	}
	
	
	@GetMapping("/report")
	public String getReport(RedirectAttributes attr,Map<String,Object> map )
	{
		
		try {
			List list=employeeService.getAllEmployee();
			
			//attr.addFlashAttribute("data",list);
			map.put("data", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return   "Get_Employee";
		
	}
	
	@GetMapping("/addEmployee")
	public String formData(@ModelAttribute("emp") Employee emp)
	{
		return "add";
	}
	
	
	  @PostMapping("/addEmployee") 
	  public String saveForm(RedirectAttributes
	  attrs, @ModelAttribute("emp") Employee emp) 
	  {
	  
	  
	  
	  try {
		  String emp1=employeeService.addEmployee(emp);
	      attrs.addFlashAttribute("msg", emp);
	  } 
	  catch (Exception e)
	  { 
	              e.printStackTrace(); 
	  
	  }
	  
	  return "redirect:report";
	  
	  // redirect:report
	  
	  
	  }
	  
	  
	  @GetMapping("/emp_edit")
		public String GetEmployee(@RequestParam("no")  int eno,@ModelAttribute("emp") Employee emp) throws Exception
		{
			Employee em= employeeService. findEmployee(eno);
			
			BeanUtils.copyProperties(em, emp);
			
			
			return "edit";
			
			
		}
		
		@PostMapping("/emp_edit")
		public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp") Employee emp)
		{
			
		String msg	=employeeService.updateEmployee(emp);
		
		attrs.addFlashAttribute("resultMsg",msg);
		
		return "redirect:report";
			
		}
		
		@GetMapping("/emp_delete")
		public String deleteEmployee(@RequestParam("no") int no,RedirectAttributes attrs)
		{
			String msg=employeeService.deleteEmployee(no);
			
			attrs.addFlashAttribute("data",msg);
			
			return "redirect:report";
		}
	 
	  
	  
	  
	

}
