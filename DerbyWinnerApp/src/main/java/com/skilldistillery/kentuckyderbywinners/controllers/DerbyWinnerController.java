package com.skilldistillery.kentuckyderbywinners.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.kentuckyderbywinners.data.DerbyDAO;
import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

//@RestController
@Controller
public class DerbyWinnerController {

	@Autowired
	private DerbyDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("AddWinner.do")
	public String createWinner() {

		return "createWinner";

	}

	@RequestMapping("confirmCreate.do")
	public String winnerCreated(RedirectAttributes redir, Derbywinner dw) {
		dao.create(dw);
		redir.addFlashAttribute("winner", dw);

		return "redirect:displayWinner.do";
	}

	@RequestMapping("UpdateWinner.do")
	public String updateWinner(Model model, Derbywinner dw) {
Derbywinner dwTest = dao.findById(dw.getId());
		model.addAttribute("winner", dwTest);

		return "updateWinner";

	}

	@RequestMapping("confirmUpdate.do")
	public String confirmUpdate(RedirectAttributes redir, Derbywinner dw) {
		dao.updateWinner(dw);
		redir.addFlashAttribute("winner", dw);

		return "redirect:displayWinner.do";
	}

	@RequestMapping("DeleteWinner.do")
	public String testDelete(Model model, Derbywinner dw) {
		Derbywinner dwdb = dao.findById(dw.getId());
		model.addAttribute("winner",dwdb);
		

		return "deleteWinner";

	}

	@RequestMapping("confirmDelete.do")
	public String winnerDeleted(Derbywinner dw) {
		dao.deleteWinner(dw.getId());

		return "redirect:home.do";
	}

	@RequestMapping("ListAllWinners.do")

	public String allWinners(Model model) {
		List<Derbywinner> listAll = dao.findAll();

		model.addAttribute("allWinners", listAll);

		return "listAllWinners";

	}

	@RequestMapping("SearchById.do")

	public String searchById(Model model, int id) {
		Derbywinner dwdb = dao.findById(id);
		model.addAttribute("winner",dwdb);


		return "displayWinner";

	}

	@RequestMapping("SearchByName.do")

	public String searchByName(Model model, String name) {
		Derbywinner dwdb = dao.findByName(name);
		model.addAttribute("winner",dwdb);

		return "displayWinner";

	}

	@RequestMapping("displayWinner.do")

	public String showWinner() {

		return "displayWinner";

	}

}
