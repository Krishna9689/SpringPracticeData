package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		//String str=null;
		//System.out.println(str.length());
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
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId")int userId,@PathVariable("userName")String name)
	{

		System.out.println("PAthVariable Example");
		System.out.println(userId);
		System.out.println(name);
		return "home";
	}
	
//	//Handling Exception In Our MVC
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull(Model m)
//	{
//		m.addAttribute("msg","null pointer exception has occured...");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumber(Model m)
//	{
//		m.addAttribute("msg","Number format exception has occured...");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGenericException(Model m)
//	{
//		m.addAttribute("msg","exception has occured...");
//		return "null_page";
//	}
}
