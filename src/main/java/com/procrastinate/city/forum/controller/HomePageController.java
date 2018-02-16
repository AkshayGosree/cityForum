package com.procrastinate.city.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.procrastinate.city.forum.model.Topics;
import com.procrastinate.city.forum.service.HomePageService;

@Controller
@RequestMapping("/")
public class HomePageController {
	
	@Autowired
	HomePageService service;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {
		List<Topics> homePage = service.returnHome();
		model.addAttribute("homePage", homePage);
		Topics topicRand = homePage.get(1);
		int topicNumber = topicRand.getTopicId();
		String topicName = topicRand.getTopicName();
		System.out.println(topicName + topicNumber);
		return "homePage";
	}
}
