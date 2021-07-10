package com.skilldistillery.kentuckyderbywinners.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

@Service
@Transactional
public class DerbyDAOJPAImpl implements DerbyDAO {
	
@PersistenceContext
	private EntityManager em;
	
	@Override
	public Derbywinner findById(int id) {
		
		return em.find(Derbywinner.class, id);
	}

}
