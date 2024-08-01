package nashitmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
//		System.out.println("working");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

}