package pract.myproj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pract.myproj.entity.Jobs;
import pract.myproj.repository.R_Jobs;
import pract.myproj.service.JobsService;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private R_Jobs r_jobs;

    @Override
    public Jobs addJob(Jobs jobs) {
        Jobs savedJob= r_jobs.saveAndFlush(jobs);
        return savedJob;
    }

    @Override
    public Jobs getByName(String name) {
        return r_jobs.findByName(name);
    }

    @Override
    public void delete(long id) {
        r_jobs.deleteById(id);
    }


    @Override
    public Jobs editJob(Jobs jobs) {
        return r_jobs.saveAndFlush(jobs);
    }

    @Override
    public List<Jobs> getAll() {
        return r_jobs.findAll();
    }
}
