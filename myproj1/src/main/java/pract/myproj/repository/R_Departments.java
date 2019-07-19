package pract.myproj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pract.myproj.entity.Departments;

@Repository
public interface R_Departments extends CrudRepository<Departments, Long> {


}
