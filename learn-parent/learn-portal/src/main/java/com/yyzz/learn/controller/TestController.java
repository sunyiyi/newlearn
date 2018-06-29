package com.yyzz.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
@RequestMapping("init")
public ModelAndView test() {
	 ModelAndView mav = new ModelAndView("index");   
     
     return mav;   
	
}
}
