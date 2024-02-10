package com.example.Dockertest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public Map<String,Object> getValues(){
		Map<String,Object> data = new HashMap<>();
		data.put("message", "java api is working file");
		data.put("languages", Arrays.asList("java","Python","devops"));
		data.put("code", 2345);
		return data;
		
	}
}
