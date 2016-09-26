package suiteinstaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MyConfig myConfig;

	@RequestMapping(value="/conf", method=RequestMethod.GET)
	@ResponseBody
	public String readConfiguration(){
		return myConfig.getConf();
	}

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
    public String installation() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

		return "hello world";
	}

	//this can handle a redirect
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model) {
		return "redirect:Enable%20HTTPS%20in%20Spring%20Boot.html";
	}

	@RequestMapping(value="/log", method=RequestMethod.GET)
	public String loghtml(Model model) {
		return "redirect:Using%20Logback%20with%20Spring%20Boot%20-%20Spring%20Framework%20Guru.html";
	}
}