package it.jac.javadb.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.javadb.dao.DocumentoRepository;
import it.jac.javadb.entity.Documento;

@Service
public class AnimationService {

	private static final Logger log = LogManager.getLogger(AnimationService.class);

	@Autowired
	private AnimationRepository repository;
	
	public String testConnessione() {
		
		log.info("Test connessione");
		
		boolean test = this.repository.testConnection();
		if (test) {
			log.info("Test OK");
		}
		return test ? "ok" : "ko";
	}
	
	public List<Animation> findAll() {
		return IteratorUtils.toList(this.repository.findAll().iterator());
	}
	
	public void creaAnimation(Documento doc) {
		
		doc.setCreationTime(new Date());
		doc.setCreationUser("system");
		
		this.repository.save(doc);
	}
	
	public void eliminaAnimation(Documento doc) {
		
		this.repository.delete(doc);
	}

	public Documento findAnimationById(Integer id) {

		return this.repository.findById(id).get();
	}

	public List<Animation> findOnlyValid() {
		
		return this.repository.findOnlyValid();
	}
	
	public void modificaAnimation(int id, String value) {

		Documento doc = findAnimationById(id);
		doc.setCodDoc(value);
		
		this.repository.save(doc);
	}
}
