package com.project.postgres.data.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.postgres.data.service.WebDataService;

@Controller
public class WebDataController {
	
	private static final Logger logger = LogManager.getLogger(WebDataController.class);
	
	@Autowired
	WebDataService service;
	
	@RequestMapping("main/main")
	public String main(Model model) throws Exception{
		
		HashMap<String,Object> pMap = new HashMap<String,Object>();
		pMap.put("fName", "3");
		model.addAttribute("now", service.now(pMap) );
		model.addAttribute("list", service.list(pMap) );
		
		return "main/main";
	}
	
}
