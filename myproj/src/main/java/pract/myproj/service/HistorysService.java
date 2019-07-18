package pract.myproj.service;

import pract.myproj.entity.Historys;

import java.util.List;

public interface HistorysService {

    Historys addHistoryIn(Historys historys);
    Historys addHistoryOut(Historys historys);
    Historys getByName(String name);
    void delete(long id);
    Historys editHistory(Historys historys);
    List<Historys> getAll();
}
