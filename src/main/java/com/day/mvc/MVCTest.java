package com.day.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.day.log.PrintLog;

@Controller
@RequestMapping("/mvc")
public class MVCTest {
	private Logger log = LoggerFactory.getLogger(MVCTest.class);
	@RequestMapping("/test")
	public String mvcTest(Model model){
		log.debug("mvc运行成功！");
		
		model.addAttribute("user", "史明辉");
		return "/mvc/mvctest";
		
		
	}
}
