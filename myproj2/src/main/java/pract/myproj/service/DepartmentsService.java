package pract.myproj.service;

import pract.myproj.entity.Departments;

import java.util.List;

public interface DepartmentsService {

    Departments addDepartment(Departments departments);
    void delete(long id);
    Departments getById(Long id);
    Departments editDepartment(Departments departments);
    List<Departments> getAll();

}
