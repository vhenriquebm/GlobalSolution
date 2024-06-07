package com.globalsolution;

import java.time.LocalDate;

public class Temperature {
	private int id;
	private double temperature;
	private LocalDate date;

	public Temperature(int id, double temperature, LocalDate date) {
		this.id = id;
		this.temperature = temperature;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
