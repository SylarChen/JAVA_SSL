package suiteinstaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
    public String installation() {
		return "hello world";
	}

	//this can handle a redirect
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
		return "redirect:Enable%20HTTPS%20in%20Spring%20Boot.html";
	}
}