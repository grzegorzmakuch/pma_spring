package pl.mqhstudio.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mqhstudio.pma.dao.EmployeeRepository;
import pl.mqhstudio.pma.entities.Employee;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;

	@GetMapping()
	public String displayListEmployees(Model model) {
		List<Employee> empList = empRepo.findAll();
		model.addAttribute("employeesList", empList);
		return "employees/list-employees";
	}

	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee anEmployee = new Employee();
		model.addAttribute("employee", anEmployee);
		return "employees/new-employee";
	}
	
	@PostMapping("/save")
	public String newEmployee(Employee employee, Model model) {
		empRepo.save(employee);
		return "redirect:/employees/new";
	}
}
