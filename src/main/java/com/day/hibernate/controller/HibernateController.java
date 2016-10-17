package com.day.hibernate.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.day.hibernate.dao.HibernateDao;

@Controller
@RequestMapping("/hibernate")
public class HibernateController {
	
	@Resource
	private HibernateDao dao;
	
	@RequestMapping("/addData")
	public void addData(){
		dao.addData();
	}
}
