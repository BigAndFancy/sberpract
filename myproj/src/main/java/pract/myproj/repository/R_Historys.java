package pract.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pract.myproj.entity.Historys;


import java.util.List;


public interface R_Historys extends JpaRepository<Historys, Long> {

    @Query("select b from Officer b where b.name = :name")
    Historys findByName(@Param("name") String name);


}
