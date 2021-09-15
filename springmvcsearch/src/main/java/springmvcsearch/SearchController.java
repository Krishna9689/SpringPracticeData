package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(path="/search",method = RequestMethod.POST)
	public RedirectView search(@RequestParam("querybox") String query)
	{
		String url="https://www.google.com/search?q="+query;
		
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl(url);
		return redirectview;
		
	}
	
	@RequestMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userID")int userId)
	{
		System.out.println("Krishna");
		System.out.println("PAthVariable Example");
		System.out.println(userId);
		return "home";
	}
}
