package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.User;
import com.training.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/registration")  
    public String showRegform(Model m){  
    	m.addAttribute("command", new User());
    	return "registration"; 
    } 
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView userRegistration(@RequestParam("userId") String userId,@RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		userService.registerUser(user);
		mv.addObject("msg", "Welcome " + userId + " ,You have successfully Registered. Now Login to your account");
		mv.setViewName("login");
		return mv;
	}
	
	
	@RequestMapping("/login")  
    public String showLoginform(Model m){  
    	m.addAttribute("command", new User());
    	return "login"; 
    } 

	
	@RequestMapping(value = "/loginto", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView userLogin(@RequestParam("userId") String userId, @RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView();

		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);

		String name = userService.loginUser(user);

		if (name != null) {
			mv.setViewName("courses");
		} else {

			mv.addObject("msg", "Invalid user id or password.");
			mv.setViewName("login");
		}
		return mv;
	}
}
