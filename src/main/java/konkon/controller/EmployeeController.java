package konkon.controller;

import konkon.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee")
public class EmployeeController {
@GetMapping("/create")
  public String showForm(ModelMap model){
  model.addAttribute("employee", new Employee());
  return "employee/create";
}
@PostMapping("/addEmployee")
  public String addEmployee(@ModelAttribute Employee employee,BindingResult result, ModelMap model){
  model.addAttribute("id", employee.getId());
  model.addAttribute("name",employee.getName());
  model.addAttribute("contactNumber",employee.getContactNumber());
  return "employee/info";
}
}
