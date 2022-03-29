package springmvcsearch;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm()
	{
		return"complex_form";
	}
	
	@RequestMapping(path="/handleForm",method=RequestMethod.GET)
	public String formHandler(@RequestAttribute("student")Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complex_form";
		}
	//	System.out.println(student);
		return "success";
	}
}
