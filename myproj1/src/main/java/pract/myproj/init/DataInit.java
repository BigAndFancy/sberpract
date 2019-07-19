package pract.myproj.init;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import antlr.debug.DebuggingParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pract.myproj.entity.Departments;
import pract.myproj.entity.Jobs;
import pract.myproj.repository.R_Departments;
import pract.myproj.repository.R_Jobs;

@Component
public class DataInit implements ApplicationRunner {

    private R_Jobs r_jobs;

    @Autowired
    public DataInit(R_Jobs r_jobs) {
        this.r_jobs=r_jobs;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count =r_jobs.count();

        if (count == 0) {
            Jobs p1 = new Jobs();

            p1.setName("RotJob");
            p1.setHours(30);

            r_jobs.save(p1);

        }

    }

}
