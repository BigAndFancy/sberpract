package pract.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pract.myproj.entity.Officers;

public interface R_Officers extends JpaRepository<Officers, Long> {

    @Query("select b from Officer b where b.name = :name")
    Officers findByName(@Param("name") String name);

}
