package com.esame.view;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.esame.controller.tempo;
import org.springframework.web.bind.annotation.*;

/*
 * questa classe interagisce con il GET 
 */
@ComponentScan(basePackages = {"com.esame.controller",})
@Controller
public class interfaccia {

	@GetMapping("/meteo")
	 public @ResponseBody String driver() {
		String out;
		out=tempo.output();
		return out;
		
	}
}
