package it.jac.javadb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import it.jac.javadb.entity.Animation;


public class CustomAnimationRepositoryImpl implements CustomAnimationRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Animation> findOnlyValid() {
		
		TypedQuery<Animation> query = em.createQuery("from Animation", Animation.class);
		return query.getResultList();
	}
	
	@Override
	public boolean testConnection() {
		
		return em.isOpen();
	}

}
