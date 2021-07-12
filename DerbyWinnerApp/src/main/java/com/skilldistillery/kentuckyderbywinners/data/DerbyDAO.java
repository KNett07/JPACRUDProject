package com.skilldistillery.kentuckyderbywinners.data;

import java.util.List;

import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

public interface DerbyDAO {
	
  Derbywinner findById(int id);
  
  Derbywinner findByYearWon(int yearWon);

Derbywinner updateWinner(Derbywinner dw);
  
  boolean deleteWinner(int id);
  
  List<Derbywinner> findAll();

Derbywinner findByName(String name);

Derbywinner create(Derbywinner dw);
  
  
  

}
