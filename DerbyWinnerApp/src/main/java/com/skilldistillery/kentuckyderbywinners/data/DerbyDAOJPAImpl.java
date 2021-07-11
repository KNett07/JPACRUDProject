package com.skilldistillery.kentuckyderbywinners.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudProject");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(dw);
		
		em.getTransaction().commit();
		
		return dw;
	}
	
	  public boolean destroy(int id) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudProject");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			em.remove(id);
			
			em.flush();
			
			em.getTransaction().commit();
		  
		  
		return false;
		  
		  
	  }

	@Override
	public Derbywinner findByYearWon(int yearWon) {
		
		
		return em.find(Derbywinner.class, yearWon);
	}

	@Override
	public Derbywinner updateWinner(String newName) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudProject");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(newName);
		
		em.flush();
		
		em.getTransaction().commit();
		
		return em.find(Derbywinner.class, newName);	
		
	}
	
	
	
	

}
