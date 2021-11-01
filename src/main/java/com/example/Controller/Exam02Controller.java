package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
//	RequestMapping("/addResult")
//	public String addResult() {
//	}
}
