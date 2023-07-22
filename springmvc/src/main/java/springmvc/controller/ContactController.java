package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Code with Durgesh");
		m.addAttribute("Desc", "You are the only chutiya");
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String showForm(Model m) {
		return "contact";
	}
	@RequestMapping(value="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		
		
		model.addAttribute("user",user); 
		
		return"success";
	}

}
	
/*	@RequestMapping(value="/processform", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("username") String username, 
			@RequestParam("email") String useremail, 
			@RequestParam("password") String password, Model model) {
		
		User user=new User();
		
		user.setUsername(username);
		user.setUseremail(useremail);
		user.setPassword(password);
		
		//System.out.println(username);
	
		
//		System.out.println("username"+ username);
//		System.out.println("userEmail"+ useremail);
//		System.out.println("userPassword"+ password);
		
//		model.addAttribute("username", username);
//		model.addAttribute("useremail", useremail);
//		model.addAttribute("userpassword", password); 
		
		
		model.addAttribute("user",user); // the attribute name that you set here, that only will be available in jsp side
		
		return"success";
	}

}*/
