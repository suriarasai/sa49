package sg.edu.nus.mvcdemo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.repo.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository prepo;
	
	@GetMapping("/list")
	public String listAll(Model model) {
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.addAll(prepo.findAll());
		model.addAttribute("products", plist);
		return "products";
	}
	
	@GetMapping("/add")
	public String showAddForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "productform";
	}
	
	@PostMapping("/insert")
	//@ModelAttribute("product")
	public String insertProduct(@ModelAttribute Product product) {
		prepo.save(product);
		return "redirect:/product/list";
	}
	

}
