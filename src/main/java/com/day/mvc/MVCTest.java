package com.day.mvc;

import javax.servlet.http.HttpServletRequest;

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
	
	/** 	网页背景图
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/canvas-nest")
	public String canvasnestTest(Model model,HttpServletRequest request){
		log.debug("mvc运行成功！");
		
		model.addAttribute("url",request.getContextPath());
		return "/page/canvas-nest";
		
		
	}
	/** 	bootstrap
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/bootstrap")
	public String bootstrapTest(Model model,HttpServletRequest request){
		log.debug("mvc运行成功！");
		
		model.addAttribute("url",request.getContextPath());
		return "/page/bootstraptest";
		
		
	}
	
	/** 	图片放大器
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/enlargepicture")
	public String enlargePictureTest(Model model,HttpServletRequest request){
		log.debug("mvc运行成功！");
		
		model.addAttribute("url",request.getContextPath());
		return "/page/enlargepicture";
		
		
	}
}
