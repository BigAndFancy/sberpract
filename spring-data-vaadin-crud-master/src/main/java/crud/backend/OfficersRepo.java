package crud.backend;


import org.springframework.data.jpa.repository.JpaRepository;


public interface OfficersRepo extends JpaRepository<Officers, Long> {
}