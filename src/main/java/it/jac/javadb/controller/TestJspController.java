package it.jac.javadb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.jac.javadb.entity.Animation;

@Controller
public class TestJspController {

	@RequestMapping(path = "/testjsp", method = RequestMethod.GET)
	public ModelAndView testjsp() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("testtaglib");
		
		List<String> list = new ArrayList<>();
		list.add("stringa1");
		list.add("stringa2");
		list.add("stringa3");
		mav.addObject("list", list);

		mav.addObject("numero", 100);
		
		Animation doc = new Animation();
		doc.setTitAni("cod1");
		doc.setYearAni(new Date());
		
		mav.addObject("obj", doc);
		
		return mav;
	}	
}
