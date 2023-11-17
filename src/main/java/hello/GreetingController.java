package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	@RequestMapping("/")
	public ModelAndView greeting() {
		return new ModelAndView("forward:/index.html");
	}
}
