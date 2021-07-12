package com.skilldistillery.kentuckyderbywinners.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.kentuckyderbywinners.data.DerbyDAO;
import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

//@RestController
@Controller
public class DerbyWinnerController {
	
	@Autowired
	private DerbyDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String index(Model model) {
		return "index";
	}
	

	@RequestMapping("AddWinner.do")
	public String createWinner( ) {
		
		
		return "createWinner";
		
	}
	
	@RequestMapping("UpdateWinner.do")
	public String testUpdate(@PathVariable("id") String id,
							@PathVariable("newName") String newName ) {
		int horseId = Integer.parseInt(id);

		Derbywinner dwUpdate = dao.findById(horseId);
		
		String currentTrainer = dwUpdate.getTrainer();
		
		dwUpdate.setTrainer(newName);
		
		String updatedTrainer = dwUpdate.getTrainer();
		
		return "updateWinner";
		
	}
	
	@RequestMapping("DeleteWinner.do")
	public String testDelete(@PathVariable("input") String delete ) {
		
		return "deleteWinner";
		
	}
	
	
	@RequestMapping("ListAllWinners.do")
	
	public String allWinners(Model model) {
		List<Derbywinner> listAll = dao.findAll();
		
		model.addAttribute("allWinners", listAll);
		
		return "listAllWinners";
		
	}
	
	@RequestMapping("SearchById.do")
	
	public String searchById(int id) {
		
		dao.findById( id);
		
		return "displayWinner";
		
	}
	
	@RequestMapping("SearchByName.do")
	
	public String searchByName(String name) {
		List<Derbywinner> listAll = dao.findAll();
		
		dao.findByName(name);
		
		return "displayWinner";
		
	}
	
	
	
	

}
