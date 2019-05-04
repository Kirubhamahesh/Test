package Maintest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Controllerclass {

	@RequestMapping(value = "/validateadminacc", method = RequestMethod.GET)
	public String validateuserAccount() {
		
		System.out.println("enter into controll  1");
		return "first";
	}
}
