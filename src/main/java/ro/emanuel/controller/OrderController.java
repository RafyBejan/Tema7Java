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

import ro.emanuel.dao.OrderDao;
import ro.emanuel.pojo.Order;

@Controller
public class OrderController {

	@GetMapping("/order")
	public String singleOrder(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		Order order = OrderDao.getById(id);
		
		model.addAttribute("s", order);
		
		return "order.jsp";
	}
	
	@GetMapping("/orders")
	public String allOrders(Model model) throws SQLException, ClassNotFoundException {
		ArrayList<Order> allOrders = OrderDao.getAll();
		
		model.addAttribute("all", allOrders);
		
		return "orders.jsp";
	}
}
