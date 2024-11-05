package springmvc.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","srisanta pradhan");
		model.addAttribute("id", 12345);
		List<String> friends = new ArrayList<String>(); 
		friends.add("srisant");
		friends.add("DIPU");
		friends.add("bikram");
		model.addAttribute("friends", friends);
		
//		Student st = new Student();
//		st.setId(123);
//		st.setName("Srisanta");
//		model.addAttribute("student", st);
//		model.addAttribute(st);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("this is help url");
		modelAndView.addObject("name","srisant");
		
		modelAndView.setViewName("help");
		
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);
        
//        Student st = new Student();
//		st.setId(123);
//		st.setName("Srisanta");
//		modelAndView.addObject("student", st);
        
		return modelAndView;
	}

}
