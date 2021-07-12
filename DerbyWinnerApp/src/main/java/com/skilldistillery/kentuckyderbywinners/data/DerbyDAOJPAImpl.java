package com.skilldistillery.kentuckyderbywinners.data;

import java.util.List;

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
	
	public Derbywinner create(Derbywinner dw) {
		
		em.persist(dw);
		
		return dw;
	}

	@Override
	public Derbywinner findByYearWon(int yearWon) {
		
//		TODO jpql not em.find
		return em.find(Derbywinner.class, yearWon);
	}

	@Override
	public Derbywinner updateWinner(Derbywinner dw) {
		Derbywinner dwdb = em.find(Derbywinner.class, dw.getId());
		
		
		dwdb.setName(dw.getName());
		dwdb.setYearWon(dw.getYearWon());
		dwdb.setTime(dw.getTime());
		dwdb.setColor(dw.getColor());
		dwdb.setTrainer(dw.getTrainer());
		dwdb.setJockey(dw.getJockey());
		
//		TODO for all fields
		
//		TODO UPDATE logic look at class notes - take in command object, id then use em.find
//		TODO store, update w setters, use values of unmanaged entity to update managed e
		em.flush();
		
		return dwdb;	
		
	}

	@Override
	public boolean deleteWinner(int id) {
		
		Derbywinner dwdb = em.find(Derbywinner.class, id);
		
		em.remove(dwdb);
		
		boolean deleteDone = !em.contains(dwdb);

		return deleteDone;
	}

	@Override
	public List<Derbywinner> findAll() {
		
		String jpql = "SELECT w from Derbywinner w";
		List<Derbywinner> listAll = em.createQuery(jpql, Derbywinner.class).getResultList();
		
		return listAll;
	}

	@Override
	public Derbywinner findByName(String name) {
		
		return em.find(Derbywinner.class, name);
	}
	
	
	
	

}
