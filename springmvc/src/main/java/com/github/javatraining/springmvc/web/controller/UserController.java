package com.github.javatraining.springmvc.web.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.javatraining.springmvc.entity.User;
import com.github.javatraining.springmvc.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public ModelAndView getUsers() {
		Iterable<User> users = userService.getUsers();
		ModelAndView mv = new ModelAndView("users", "users", users);
		return mv;
	}

	@GetMapping("/index")
	public ModelAndView index(@RequestParam(required = false) String action) {
		String view = "user_";
		if (Strings.isEmpty(action)) {
			view = view + "index";
		} else {
			view = view + action;
		}
		return new ModelAndView(view);
	}

	@GetMapping("/view/{id}")
	public ModelAndView getUser(@PathVariable("id") long id) {
		User u = userService.findUserById(id);
		return new ModelAndView("user", "user", u);
	}

	@PostMapping
	public ModelAndView createUser(@ModelAttribute User user) {
		userService.createUser(user);
		return new ModelAndView("user");
	}

	@PutMapping
	public ModelAndView updateUser(@ModelAttribute User user) {
		userService.updateUser(user);
		return new ModelAndView("user");
	}

	@GetMapping("/delete/{id}")
	public ModelAndView deleteUser(@PathVariable("id") long id) {
		userService.deleteUser(id);
		return new ModelAndView("redirect:/users/index");
	}

}
