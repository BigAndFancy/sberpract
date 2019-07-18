package pract.myproj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pract.myproj.entity.Historys;
import pract.myproj.repository.R_Historys;
import pract.myproj.service.HistorysService;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistorysService {

    @Autowired
    private R_Historys r_historys;

    @Override
    public Historys addHistoryIn(Historys historys) {
        Historys savedHistory= r_historys.saveAndFlush(historys);

        return savedHistory;
    }

    @Override
    public Historys addHistoryOut(Historys historys) {
        Historys savedHistory= r_historys.saveAndFlush(historys);

        return savedHistory;
        //!!!
    }

    @Override
    public Historys getByName(String name) {
        return r_historys.findByName(name);
    }

    @Override
    public void delete(long id) {
        r_historys.deleteById(id);
    }


    @Override
    public Historys editHistory(Historys historys) {
        return r_historys.saveAndFlush(historys);
    }

    @Override
    public List<Historys> getAll() {
        return r_historys.findAll();
    }
}
