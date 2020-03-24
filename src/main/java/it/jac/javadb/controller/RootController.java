package it.jac.javadb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView root() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/jac/home");
		
		return mav;
	}	
}
