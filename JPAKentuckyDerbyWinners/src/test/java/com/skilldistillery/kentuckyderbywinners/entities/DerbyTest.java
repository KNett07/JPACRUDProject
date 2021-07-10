package com.skilldistillery.kentuckyderbywinners.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DerbyTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private DerbyWinner dw;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("DerbyWinnersPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		dw = em.find(DerbyWinner.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		dw = null;
	}

	@Test
	void test_DerbyWinner_mapping() {
		assertNotNull(dw);
		assertEquals("Fusaichi Pegasus", dw.getName());
	}

}
