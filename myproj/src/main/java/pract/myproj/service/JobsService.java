package pract.myproj.service;

import pract.myproj.entity.Jobs;

import java.util.List;

public interface JobsService {

    Jobs addJob(Jobs jobs);
    Jobs editJob(Jobs jobs);
    Jobs getByName(String name);
    void delete(long id);
    List<Jobs> getAll();
}
