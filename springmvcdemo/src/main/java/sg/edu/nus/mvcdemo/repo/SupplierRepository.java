package sg.edu.nus.mvcdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.mvcdemo.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String>{
	

}
