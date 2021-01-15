package com.tonykipchirchir.Zenith.Logistics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationHomeContoller {
	
	@GetMapping("/home")
	public String goToHomePage() {
		return "index";
	}

}
