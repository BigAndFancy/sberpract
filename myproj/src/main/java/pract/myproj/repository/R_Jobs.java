package pract.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pract.myproj.entity.Jobs;

import java.util.List;

public interface R_Jobs extends JpaRepository<Jobs, Long> {

    @Query("select b from Officer b where b.name = :name")
    Jobs findByName(@Param("name") String name);


}
