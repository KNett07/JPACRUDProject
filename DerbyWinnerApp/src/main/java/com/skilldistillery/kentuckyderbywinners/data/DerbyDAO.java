package com.skilldistillery.kentuckyderbywinners.data;

import com.skilldistillery.kentuckyderbywinners.entities.Derbywinner;

public interface DerbyDAO {
	
  Derbywinner findById(int id);
  
  Derbywinner findByYearWon(int yearWon);

Derbywinner updateWinner(String newName);
  
  
  
  

}
