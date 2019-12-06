package sg.edu.nus.mvcdemo.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
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
		return null;
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductByExample(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProduct(Product p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public ArrayList<Supplier> listOfSuppliers() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
