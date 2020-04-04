package it.jac.javadb.controller;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.jac.javadb.controller.validation.AnimationValidator;
import it.jac.javadb.controller.validation.TimestampEditor;
import it.jac.javadb.dto.AnimationDTO;
import it.jac.javadb.entity.Animation;
import it.jac.javadb.service.AnimationService;

@Controller
@RequestMapping("/jac")
@Secured("ROLE_USER")
public class AnimationController {

	private Logger log = LoggerFactory.getLogger(AnimationController.class);
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(new AnimationValidator());
		binder.registerCustomEditor(Timestamp.class, new TimestampEditor());
	}
	
	@Autowired
	private AnimationService service;
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		
		return mav;
	}	
	
	@Secured("ROLE_EDIT")
	@RequestMapping(path = "/insert", method = RequestMethod.GET)
	public ModelAndView pageInsert() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("insert");
		
		AnimationDTO dto = new AnimationDTO();
		mav.addObject("dto", dto);
		
		return mav;
	}

	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public ModelAndView sendAnimationnfo(
			@ModelAttribute("dto") @Validated AnimationDTO dto, 
			BindingResult bindingResult) {
		
		log.debug("codani {}", dto.getTitAni());
		log.debug("yearani {}", dto.getYearAni());

		ModelAndView mav = new ModelAndView();

		if (bindingResult.hasErrors()) {
			
			log.warn("Errore nel binding dei parametri");
			mav.setViewName("insert");
			
		} else {
			
			// bind parametri corretto
			// posso procedere con il salvataggio dei dati su DB
			mav.setViewName("redirect:/jac/list");
			
			Animation ani = new Animation();
			BeanUtils.copyProperties(dto, ani);
			
			service.creaAnimation(ani);
		}
		
		return mav;
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public ModelAndView pageUpdate(@RequestParam(name = "aniId") String parId) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update");
		
		Animation animation = service.findAnimationById(Integer.parseInt(parId));
		if (animation != null) {
			
			AnimationDTO dto = new AnimationDTO();
			BeanUtils.copyProperties(animation, dto);
			
			mav.addObject("dto", dto);
			
		} else {
			
			throw new IllegalArgumentException("Anime id " + parId + " is not valid");
			
		}
		return mav;
	}
	
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public ModelAndView pageList() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		
		List<Animation> list = service.findAll();
		mav.addObject("list", list);
		
		return mav;
	}	

	@RequestMapping(path = "/detail", method = RequestMethod.GET)
	public ModelAndView pageDetail(@RequestParam(name = "aniId") String parId) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("detail");
		
		Animation animation = service.findAnimationById(Integer.parseInt(parId));
		if (animation != null) {
			
			AnimationDTO dto = new AnimationDTO();
			// utilità
			BeanUtils.copyProperties(animation, dto);
			
			mav.addObject("dto", dto);
			
		} else {
			
			throw new IllegalArgumentException("Anime id " + parId + " is not valid");
			
		}
		return mav;
	}
}
