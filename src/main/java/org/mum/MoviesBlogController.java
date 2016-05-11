package org.mum;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoviesBlogController  {
	@RequestMapping("/")
	public String home(Model model){
		System.out.println("Lado");
		model.addAttribute("msg","Welcome!");
		return "home";
	}

}
