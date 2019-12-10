package sg.edu.nus.mvcdemo.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.model.Supplier;
import sg.edu.nus.mvcdemo.repo.ProductRepository;
import sg.edu.nus.mvcdemo.repo.SupplierRepository;

@Service
public class ProductServiceImpl implements ProductServices {
	
	private ProductRepository productRepository;
	private SupplierRepository sRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Autowired
    public void setSupplierRepository(SupplierRepository supplierRepository) {
        this.sRepository = supplierRepository;
    }

	@Override
	public ArrayList<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList<Product> (productRepository.findAll());
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.getOne(id);
	}

	@Override
	public  ArrayList<Product>  findProductByExample(Product p) {
		// TODO Auto-generated method stub
		Example<Product> e =Example.of(p); 
		return new ArrayList<Product> (productRepository.findAll(e));
	}

	@Override
	public void saveProduct(Product p) {
		// TODO Auto-generated method stub
		productRepository.save(p);

	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		productRepository.delete(p);
	}

	@Override
	@Transactional
	public ArrayList<Supplier> listOfSuppliers(int id) {
		// TODO Auto-generated method stub
		return productRepository.findListOfAllSupplier(id);
	}

}
