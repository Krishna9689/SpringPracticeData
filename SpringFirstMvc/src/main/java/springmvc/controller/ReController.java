package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one()
	{
		System.out.println("This Is First Handler");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This Is Second Handler");
		return "contact";
	}
	
	@RequestMapping("/three")
	public RedirectView three()
	{
	   RedirectView ob=new RedirectView();
	   ob.setUrl("enjoy");
	   return ob;
	}
	
}
