package sg.edu.nus.mvcdemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.service.ProductServiceImpl;
import sg.edu.nus.mvcdemo.service.ProductServices;

@Controller
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	private ProductServices pservice;
	
	@Autowired
	public void setProductServices(ProductServiceImpl pimpl) {
        this.pservice = pimpl;
    }
	  @InitBinder
	  protected void initBinder(WebDataBinder binder) {
		//binder.addValidators(new ProductValidator());
	  }


	@GetMapping("/list")
	public String listAll(Model model) {
		model.addAttribute("products", pservice.findAllProducts());
		return "products";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "productform";
	}

	//@PostMapping("/save")
	@RequestMapping(value = "/save", path = "/save", method = { RequestMethod.GET, RequestMethod.POST }, produces = "text/html")
	public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("product", product);
			return "productform";
		}
		pservice.saveProduct(product);
		return "forward:/product/list";
	}
	
	@GetMapping("/edit/{id}")
	public String showEditForm(Model model, @PathVariable("id") Integer id) {	
		model.addAttribute("product", pservice.findProductById(id));
		return "productform";
	}
	@GetMapping("/delete/{id}")
	public String deleteMethod(Model model, @PathVariable("id") Integer id) {
		Product product = pservice.findProductById(id);
		pservice.deleteProduct(product);
		return "forward:/product/list";
	}
	
	@GetMapping("/supplierlist/{id}")
	public String supplierList(Model model, @PathVariable("id") Integer id) {
		model.addAttribute("suppliers", pservice.listOfSuppliers(id));
		return "supplierlist";
	}

}
