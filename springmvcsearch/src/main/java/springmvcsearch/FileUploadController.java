package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		return "fileform";
	}
	
	@RequestMapping(path="/uploadfile",method=RequestMethod.POST)
	public String uploadFile(@RequestParam("profile")CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println("File Upload Handler");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		byte[] data=file.getBytes();
		//we have to save this file to server 
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File Uploaded...");
		m.addAttribute("msg","Uploaded Successfully...");
		m.addAttribute("filename", file.getOriginalFilename());
		
		}catch (Exception e) {
	          e.printStackTrace();
	          System.out.println("Uploading Error...");
	  		m.addAttribute("msg","Uploaded Error...");

		}
		
		
		return "filesuccess";
	}
}
