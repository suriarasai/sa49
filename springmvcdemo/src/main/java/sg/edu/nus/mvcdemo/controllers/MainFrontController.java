package sg.edu.nus.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import sg.edu.nus.mvcdemo.model.UserSession;

@Controller
public class MainFrontController {
	
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("user", new UserSession());
		return "login";
	}
	
	@GetMapping("/logout")
	public String getLogoutPage(SessionStatus status) {
		status.setComplete();
		return "home";
	}
	
	@PostMapping("/authenticate")
	public String getAuthentication(@ModelAttribute("user") UserSession user, BindingResult bindingResult) {
		if (user.getName().equalsIgnoreCase("dilbert"))
			return "redirect:/product/list";
		else 
		return "login";
	}
	
}
