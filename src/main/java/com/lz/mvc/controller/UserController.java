package com.lz.mvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lz.mvc.pojo.User;
import com.lz.mvc.service.IUserSevice;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource
	private IUserSevice userService = null;

	@RequestMapping("/iduser.action")
	private String user(Locale locale, Model model) {
		logger.info("Welcome user page! The client locale is {}.", locale);
		User user = userService.getUserNameById(1);
		model.addAttribute("user", user);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		List<User> users = userService.getUsers();
		model.addAttribute("users",users);
		return "user";
	}
}
