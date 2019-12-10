package sg.edu.nus.mvcdemo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.model.Supplier;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query("Select s from Product p, Supplier s where p.id = :id")
	public ArrayList<Supplier> findListOfAllSupplier(@Param("id") int id);
}
