package sg.edu.nus.mvcdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sg.edu.nus.mvcdemo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
