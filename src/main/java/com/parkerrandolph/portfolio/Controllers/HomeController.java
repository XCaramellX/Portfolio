package com.parkerrandolph.portfolio.Controllers;

//import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
	public String index() {
		return "index";
	}
    
	@RequestMapping(value = "/mywork")
	public String mywork() {
		return "mywork";
	}
}
