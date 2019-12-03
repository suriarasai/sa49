package sg.edu.nus.mvcdemo.controllers;

import java.util.ArrayList;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.mvcdemo.model.Product;
import sg.edu.nus.mvcdemo.repo.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository prepo;
	
	  @InitBinder
	  protected void initBinder(WebDataBinder binder) {
		//binder.addValidators(new ProductValidator());
	  }


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

	@PostMapping("/save")
	public String saveProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			//model.addAttribute("product", product);

			return "productform";
		}
		prepo.save(product);
		return "redirect:/product/list";
	}
	
	@GetMapping("/edit/{id}")
	public String showEditForm(Model model, @PathVariable("id") Integer id) {	
		Product product = prepo.findById(id).get();
		model.addAttribute("product", product);
		return "productform";
	}
	@GetMapping("/delete/{id}")
	public String deleteMethod(Model model, @PathVariable("id") Integer id) {
		Product product = prepo.findById(id).get();
		prepo.delete(product);
		return "redirect:/product/list";
	}

}
