package it.jac.javadb.controller.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.jac.javadb.dto.AnimationDTO;

public class AnimationValidator implements Validator {

	private Logger log = LoggerFactory.getLogger(AnimationValidator.class);
			
	@Override
	public boolean supports(Class<?> clazz) {
		return AnimationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		log.debug("Validate object Anime");
	}

}
