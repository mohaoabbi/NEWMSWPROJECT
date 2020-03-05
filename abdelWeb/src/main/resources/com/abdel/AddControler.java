package com.abdel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddControler {
	
	
	@RequestMapping("/add")
	public String add() {
		
		return "display.jsp";
	}

}
