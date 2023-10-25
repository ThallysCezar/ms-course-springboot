package com.spring.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}

	public Worker(Long id, String name, Double dailyInCome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyInCome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyInCome() {
		return dailyIncome;
	}

	public void setDailyInCome(Double dailyInCome) {
		this.dailyIncome = dailyInCome;
	}
	
	
}
