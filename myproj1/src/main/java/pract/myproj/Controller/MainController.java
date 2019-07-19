package pract.myproj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pract.myproj.entity.Departments;
import pract.myproj.entity.Jobs;
import pract.myproj.repository.R_Departments;
import pract.myproj.repository.R_Jobs;

@Controller
public class MainController {


    @Autowired
    private R_Jobs r_jobs;

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        Iterable<Jobs> all=r_jobs.findAll();

        StringBuilder sb=new StringBuilder();

        all.forEach(p -> sb.append(p.getName() + "<br>"));

        return sb.toString();
    }
}
