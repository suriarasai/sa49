package sg.edu.nus.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.restful.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
