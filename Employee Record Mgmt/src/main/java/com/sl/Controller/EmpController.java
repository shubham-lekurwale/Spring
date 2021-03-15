package com.sl.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sl.Entity.Employee;
import com.sl.Service.ServiceEmp;

@Controller
public class EmpController {

	@Autowired
	private ServiceEmp service;	

	@RequestMapping("Home")
	public String Home() {
		return "index";
	}
	
	@RequestMapping("Registration")
	public String AddEmployee(Model model) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "Registration";
	}

	@RequestMapping(value = "saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee emp,RedirectAttributes ra ,BindingResult br) {
		if(br.hasErrors())
		{
			return "Registration";
		}else {
		service.SaveEmployee(emp);
		ra.addFlashAttribute("message","Your Feedback is added successfully");
		return "redirect:/status";
		}
	}
	
	@RequestMapping("status")
	public String status() {
		return "status";
	}
	
	@RequestMapping("updateEmployee")
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee emp,BindingResult br) {
		if(br.hasErrors())
		{
			return "Update";
		}else {
		service.SaveEmployee(emp);		
		return "Login";
		}
	}
	
	@RequestMapping("Records")
	public String Records(Model model) {
		List<Employee> empList = service.getRecords();
		model.addAttribute("empList", empList);
		return "Records";
	}

	@RequestMapping("loginEmp")
	public String loginEmp(HttpServletRequest req ,Model modelProf) {
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		List<Employee> emp = service.LoginEmp(name, password);
		if (emp.isEmpty()) {
			return "Error";
		} else {
			modelProf.addAttribute("profile", emp);
			return "Profile";
		}

	}

	@RequestMapping("Login")
	public String login() {
		return "Login";
	}

	@RequestMapping("UpdateEmp")
	public String updateProfile(@RequestParam("EmpId") Integer id, Model model) {
		Employee emp = getById(id);
		model.addAttribute("updateEmp", emp);
		return "Update";
	}

	@RequestMapping("DeleteEmp")
	public String deleteProfile(@RequestParam("EmpId") Integer did) {
		Employee emp = getById(did);
		service.deleteEmp(emp);
		return "status";
	}

	private Employee getById(Integer id) {
		Employee emp = service.getById(id);
		return emp;
	}
}
