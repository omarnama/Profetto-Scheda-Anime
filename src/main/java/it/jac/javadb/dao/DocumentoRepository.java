package it.jac.javadb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.javadb.entity.Animation;



@Repository
public interface AnimationRepository extends CrudRepository<Animation, Integer>, CustomAnimationRepository {

}
