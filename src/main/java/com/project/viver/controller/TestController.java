package com.project.viver.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("helloViver") 
	public List<String> hello() {
		return Arrays.asList("Hello Viver","juhui","xxohyun","eunbee","sanggooo","haeun","hyunjiii");
		
		
	}

}
