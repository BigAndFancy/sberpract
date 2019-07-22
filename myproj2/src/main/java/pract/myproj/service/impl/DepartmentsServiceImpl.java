package pract.myproj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pract.myproj.entity.Departments;
import pract.myproj.repository.R_Departments;
import pract.myproj.service.DepartmentsService;

import java.util.List;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

    @Autowired
    private R_Departments r_departments;

    @Override
    public Departments addDepartment(Departments departments) {
        Departments savedDepartment= r_departments.saveAndFlush(departments);

        return savedDepartment;
    }

    @Override
    public void delete(Long id) {
        r_departments.deleteById(id);
    }

    @Override
    public Departments editDepartment(Departments departments) {
        return r_departments.saveAndFlush(departments);
    }

    @Override
    public Departments getById(Long id) {
        return r_departments.findById(id).get();
    }

    @Override
    public List<Departments> getAll() {
        return r_departments.findAll();
    }

}
