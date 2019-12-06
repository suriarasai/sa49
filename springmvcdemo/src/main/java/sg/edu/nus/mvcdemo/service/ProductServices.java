package sg.edu.nus.mvcdemo.service;

import java.util.ArrayList;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.model.Supplier;

public interface ProductServices {
	
	public ArrayList<Product> findAllProducts();
	public Product findProductById(int id);
	public Product findProductByExample(Product p);
	public void saveProduct(Product p);
	public void deleteProduct(Product p);
	public ArrayList<Supplier> listOfSuppliers();
	

}
