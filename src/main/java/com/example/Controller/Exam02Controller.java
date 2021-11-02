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
	
	@RequestMapping("/addResult")
	public String addResult(Integer num1,Integer num2,Integer answer) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", num1+num2);
		
		return  "exam02-result";
		
		
	}
	@RequestMapping("/toResult")
	public String toResult() {
		return "exam02-result2";
	}
}
