package com.skilldistillery.kentuckyderbywinners.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.kentuckyderbywinners.data.DerbyDAO;

@Controller
public class DerbyWinnerController {
	
	@Autowired
	private DerbyDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("winner", dao.findById(1)); //debug
		return "index";
	}
	

}
