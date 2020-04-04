package it.jac.javadb.controller;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//OLD Generic ERROR
//@Controller
//public class GenericErrorController implements ErrorController {
//
//	@Override
//	public String getErrorPath() {
//		return "/error";
//	}
//
//	@RequestMapping(path = "/error")
//	public ModelAndView handleError () {
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("genericError");
//		
//		return mav;
//	}

@ControllerAdvice
public class GenericErrorController {
	
	@ExceptionHandler(AccessDeniedException.class)
	public ModelAndView handleAccessDeniedException(AccessDeniedException ex) {

		return new ModelAndView("accessDenied");
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {

		return new ModelAndView("genericError");
	}

}
