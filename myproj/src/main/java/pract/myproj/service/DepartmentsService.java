package pract.myproj.service;

import pract.myproj.entity.Departments;

import java.util.List;

public interface DepartmentsService {

    Departments addDepartment(Departments departments);
    void delete(long id);
    Departments getByName(String name);
    Departments editDepartment(Departments departments);
    List<Departments> getAll();

}