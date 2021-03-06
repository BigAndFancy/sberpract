package pract.myproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pract.myproj.entity.Departments;

@Repository
public interface R_Departments extends JpaRepository<Departments, Long> {

}
