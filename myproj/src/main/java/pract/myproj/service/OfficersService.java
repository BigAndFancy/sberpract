package pract.myproj.service;

import pract.myproj.entity.Officers;

import java.util.List;

public interface OfficersService {

    Officers addOfficer(Officers officers);
    Officers editOfficer(Officers officers);
    Officers getByName(String name);
    void delete(long id);
    List<Officers> getAll();

}
