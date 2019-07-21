package pract.myproj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pract.myproj.entity.Departments;
import pract.myproj.service.DepartmentsService;
import pract.myproj.service.impl.DepartmentsServiceImpl;

import java.util.List;

@Controller
public class MainController {

    private DepartmentsService departmentsService = new DepartmentsServiceImpl();

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getDepartmentPage(Model model) {
        List<Departments> departments = departmentsService.getAll();
        model.addAttribute("departmentsList", departments);
        return "department";
    }

    @RequestMapping(value = "/add-new-department", method=RequestMethod.GET)
    public String addNewDepartmentPage() {
        return "addNewDepartment";
    }

    @RequestMapping(value="/add-new-department", method=RequestMethod.POST)
    public String addNewDepartment(@RequestParam(value="name") String name) {
        Departments departments = new Departments();
        departments.setName(name);
        departmentsService.addDepartment(departments);
        return "redirect:/";
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.GET)
    public String deleteDepartment(@PathVariable Long id) {
        Departments departments = departmentsService.getById(id);
        departmentsService.delete(id);
        return "redirect:/";
    }
}
