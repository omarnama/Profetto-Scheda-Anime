package it.jac.javadb.dao;

import java.util.List;

import it.jac.javadb.entity.Animation;


public interface CustomAnimationRepository {

	public List<Animation> findOnlyValid();

	boolean testConnection();
}
