package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

@Controller
public class HomeController {
	
	@RequestMapping(value ="/home",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is my home");
		model.addAttribute("name","Anjali Rani");
		model.addAttribute("id",123);
		List<String> friends=new ArrayList<>();
		friends.add("Vandana");
		friends.add("Anjali");
		friends.add("Vandana sivadas");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	@RequestMapping(value="/help", method = RequestMethod.GET)
	public ModelAndView help(){
		System.out.println("Model and view help");
		//creating ModelAndView Object
		ModelAndView modelandview=new ModelAndView();
		//setting the data
		modelandview.addObject("name", "Uttam");
		modelandview.addObject("roll", 456);
		//setting the view name
		modelandview.setViewName("help");
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time", now);
		List<Integer> ls=new ArrayList<>();
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		modelandview.addObject("markes",ls);
		System.out.println("Model and view help working");
		
		return modelandview;
	}
	@RequestMapping(value ="/about",method = RequestMethod.GET)
	public String about() {
		System.out.println("hello, This is about my page");
		return "about";
	}
}
