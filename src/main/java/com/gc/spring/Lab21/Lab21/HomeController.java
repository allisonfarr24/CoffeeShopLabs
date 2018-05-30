package com.gc.spring.Lab21.Lab21;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private UsersDao usersDao;

	@Autowired
	ItemsDao itemsDao;

	@Autowired
	Person p;

	@RequestMapping("/")
	public ModelAndView testing(Model model) {
		List<Item> items = itemsDao.findAll();
		model.addAttribute("items", items);

		return new ModelAndView("index", "register", "");
		// Use Model model as parameter if trying to display multiple items on the same
		// page

	}

	// this is to render the view for the form.jsp
	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@RequestMapping("/form1")
	public ModelAndView formTest(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("phoneNum") String phoneNum,
			@RequestParam("password") String password) {

		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setEmail(email);
		p.setPhoneNum(phoneNum);
		p.setPassword(password);

		Person p = new Person(firstName, lastName, email, phoneNum, password);

		usersDao.addUser(p);

		return new ModelAndView("summary", "person", p);

	}
	
	

}
