package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonCode(Model m)
	{
		m.addAttribute("Header","Learn Code With Krishna");
		m.addAttribute("Desc","Home For Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
 
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{	
		if(user.getUser().isEmpty())
		{
			return "redirect:/contact";
		}
		this.userService.createUser(user);
		return "success";
	}
	
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(@RequestParam("email")String email,@RequestParam("user")String user
//			,@RequestParam("pass")String pass, Model model)
//	{	
//		
//		User ob=new User();
//		ob.setEmail(email);
//		ob.setUser(user);
//		ob.setPass(pass);
////		System.out.println(email);
////		System.out.println(user);
////		System.out.println(pass);
////		
//		model.addAttribute("name",user);
//		model.addAttribute("email",email);
//		model.addAttribute("pass",pass);
//		return "success";
//	}
}
