package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model)
	{
		System.out.println("This IS Home URL...");
        model.addAttribute("name","Krishna Sinnarkar");
        
        List<String> friends=new ArrayList<String>();
        friends.add("Priya");
        friends.add("Trupti");
        friends.add("Renuka");
        friends.add("Mohini");
        
        model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about url...");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Help Controller...");
		ModelAndView modelandview=new ModelAndView();
		modelandview.addObject("name", "KRISH");
		LocalDateTime ob=LocalDateTime.now();
		modelandview.addObject("time",ob);
		
		 List<String> friends=new ArrayList<String>();
	        friends.add("KRISH");
	        friends.add("MARK");
	        friends.add("YUNG");
	        friends.add("SHWN");
	        
		modelandview.addObject("marks",friends);
		modelandview.setViewName("help");
		return modelandview; 
	}
}
