package pract.myproj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pract.myproj.entity.Officers;
import pract.myproj.repository.R_Officers;
import pract.myproj.service.OfficersService;

import java.util.List;

@Service
public class OfficersServiceImpl implements OfficersService {
    @Autowired
    private R_Officers r_officers;

    @Override
    public Officers addOfficer(Officers officers) {
        Officers saveOfficer= r_officers.saveAndFlush(officers);
        return saveOfficer;
    }

    @Override
    public void delete(long id) {
        r_officers.deleteById(id);
    }

    @Override
    public Officers getByName(String name) {
        return r_officers.findByName(name);
    }

    @Override
    public Officers editOfficer(Officers officers) {
        return r_officers.saveAndFlush(officers);
    }

    @Override
    public List<Officers> getAll() {
        return r_officers.findAll();
    }
}
