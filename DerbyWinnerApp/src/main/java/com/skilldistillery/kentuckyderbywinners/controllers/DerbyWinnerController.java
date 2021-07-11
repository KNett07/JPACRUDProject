package com.skilldistillery.kentuckyderbywinners.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.kentuckyderbywinners.data.DerbyDAO;
import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

@RestController
@Controller
public class DerbyWinnerController {
	
	@Autowired
	private DerbyDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("winner", dao.findById(1)); //debug
		return "index";
	}
	

	@RequestMapping("/test/create/{input}")
	public String testCreate(@PathVariable("input") String insert ) {
		
		
		return "Hello World" + insert;
		
	}
	
	@RequestMapping("/test/update/{id}/{newName}")
	public String testUpdate(@PathVariable("id") String id,
							@PathVariable("newName") String newName ) {
		int horseId = Integer.parseInt(id);

		Derbywinner dwUpdate = dao.findById(horseId);
		
		String currentTrainer = dwUpdate.getTrainer();
		
		dwUpdate.setTrainer(newName);
		
		String updatedTrainer = dwUpdate.getTrainer();
		
		return currentTrainer + "/n" + updatedTrainer;
		
	}
	
	@RequestMapping("/test/delete/{input}")
	public String testDelete(@PathVariable("input") String delete ) {
		
		return "Hello World" + delete;
		
	}
	
	@RequestMapping("/test/read/{input}")
	public String testRead(@PathVariable("input") String input ) {
		int id = Integer.parseInt(input);
		return dao.findById(id).toString();
		
	}
	
	
	
	

}
