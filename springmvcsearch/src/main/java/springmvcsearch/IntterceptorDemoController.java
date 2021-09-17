package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IntterceptorDemoController {

	@RequestMapping("/Demo")
	public String welcomeDemo()
	{
		return "Demo";
	}
	
	
	@RequestMapping(path="/welcome",method=RequestMethod.POST)
	public String Demo(@RequestParam("user")String name,Model m)
	{
		System.out.println(name);
		m.addAttribute("name",name);
		return "welcome";
	}
}
