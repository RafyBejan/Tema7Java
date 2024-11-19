package ro.emanuel.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.dao.PhoneDao;
import ro.emanuel.pojo.Phone;

@Controller
public class PhoneController {

	@GetMapping("/phone")
	public String singlePhone(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		Phone phone = PhoneDao.getById(id);
		
		model.addAttribute("s", phone);
		
		return "phone.jsp";
	}
	
	@GetMapping("/phones")
	public String allPhones(Model model) throws SQLException, ClassNotFoundException {
		ArrayList<Phone> allSongs = PhoneDao.getAll();
		
		model.addAttribute("all", allSongs);
		
		return "phones.jsp";
	}
}