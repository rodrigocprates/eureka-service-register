package com.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.model.Greeting;

@RestController
public class HelloRestController {

	private static final String template = "Hello, %s! I'm Mr REST.";
	
	@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Prates") String name) {
        String content = String.format(template, name);
		
        return new Greeting(content);
	}
	
}
