package com.eidiko.niranjana.controller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eidiko.niranjana.entity.Employee;
import com.eidiko.niranjana.service.IEmployeeMgmtService;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	 private IEmployeeMgmtService  service;
	@GetMapping("/welcome")
	public String showForm()
	{
		return "home";
	}
	//1. show Register page
		@GetMapping("/register")
		public String showReg() {
			return "EmployeeRegister";
		}
	//2. save operation
		@PostMapping("/save")
		public String saveData(
				@ModelAttribute Employee employee, //reading form data
				Model model
				) 
		{
			Integer id = service.saveEmployee(employee); //store in db
			String message = "Employee '"+id+"' Created!"; //create message
			model.addAttribute("messageView", message); //send message to ui
			return "EmployeeRegister";
		}
//================================Update operation=============================
		@GetMapping("/edit")
		public String showEdit(@ModelAttribute Integer id,Model model) 
		{
			Employee e = service.getOneEmployee(id);
			model.addAttribute("employee", e);
			return "EmployeeEdit";
		}
		@PostMapping("/update")
		public String updateData(@ModelAttribute Employee employee,Model model) 
		{
		 service.updateEmployee(employee);
			String message = "Employee '"+employee.getEmpId()+"' Created!"; //create message
			model.addAttribute("messageView",message );
			return "EmployeeEdit";
		}
//==================================================================================	
	
		
	
	/*	@PostMapping("/edit")
		public   String  editEmployee(Map<String,Object> map,@ModelAttribute("empFrm") Employee emp) {
			//use service
			String msg=service.updateEmployee(emp);
			Iterable<Employee> it=service.fetchAllEmployees();
				//result in model attribute
					map.put("empsList",it);
					map.put("resultMsg",msg);
			//return lnv
				return "show_emps";
		}//method
	
	
	@PostMapping("/edit")
	public   String  editEmployee(RedirectAttributes attrs,@ModelAttribute("empFrm") Employee emp) {
		//use service
		String msg=service.updateEmployee(emp);
			//result in model attributes as flash attributes
		     attrs.addFlashAttribute("resultMsg",msg);
           return "redirect:report";				
	}//method
	
	
	@GetMapping("/delete")
	public   String    deleteEmployee(RedirectAttributes attrs,
			                                                 @RequestParam("no") int eno) {
		//use service
		service.deleteEmployee(eno);
		//keep result as model Attribute
		 attrs.addFlashAttribute("resultMsg",eno+" Employee deleted");
		  return "redirect:report";				
	}
	*/
	 
}
