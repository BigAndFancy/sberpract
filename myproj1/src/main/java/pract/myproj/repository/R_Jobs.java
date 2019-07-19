package pract.myproj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pract.myproj.entity.Jobs;

@Repository
public interface R_Jobs extends CrudRepository<Jobs,Long> {
}
