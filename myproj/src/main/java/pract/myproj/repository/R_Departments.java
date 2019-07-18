package pract.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pract.myproj.entity.Departments;


import java.util.List;

public interface R_Departments extends JpaRepository<Departments, Long> {

    @Query("select b from Officer b where b.name = :name")
    Departments findByName(@Param("name") String name);


}
