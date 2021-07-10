package com.skilldistillery.kentuckyderbywinners.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Derbywinner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name="year_won")
	private int yearWon;
	
	private double time;
	
	private String color;
	
	private String trainer;
	
	private String jockey;
	
	

	public Derbywinner() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYearWon() {
		return yearWon;
	}



	public void setYearWon(int yearWon) {
		this.yearWon = yearWon;
	}



	public double getTime() {
		return time;
	}



	public void setTime(double time) {
		this.time = time;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getTrainer() {
		return trainer;
	}



	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}



	public String getJockey() {
		return jockey;
	}



	public void setJockey(String jockey) {
		this.jockey = jockey;
	}



	@Override
	public String toString() {
		return "Derbywinner [id=" + id + ", name=" + name + ", yearWon=" + yearWon + ", time=" + time + ", color="
				+ color + ", trainer=" + trainer + ", jockey=" + jockey + "]";
	}

	
	
}
