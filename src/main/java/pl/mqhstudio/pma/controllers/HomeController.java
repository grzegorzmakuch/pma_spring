package pl.mqhstudio.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mqhstudio.pma.dao.EmployeeRepository;
import pl.mqhstudio.pma.dao.ProjectRepository;
import pl.mqhstudio.pma.entities.Employee;
import pl.mqhstudio.pma.entities.Project;

import java.util.List;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		List<Project> projects = proRepo.findAll();
		List<Employee> employees = empRepo.findAll();
		model.addAttribute("projectsList", projects);
		model.addAttribute("employeesList", employees);
		return "main/home";
	}
}
