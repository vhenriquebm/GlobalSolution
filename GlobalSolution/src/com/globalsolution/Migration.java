package com.globalsolution;

import java.time.LocalDate;

public class Migration {
	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Location originLocation;
	private Location destinationLocation;
	private Specie specie;

	public Migration(int id, LocalDate startDate, LocalDate endDate, Location originLocation,
			Location destinationLocation, Specie specie) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.originLocation = originLocation;
		this.destinationLocation = destinationLocation;
		this.specie = specie;
	}

	public Migration(int id2, String startDate2, String endDate2, Location originalLocation,
			Location destinationLocation2, Specie specie2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Location getOriginLocation() {
		return originLocation;
	}

	public void setOriginLocation(Location originLocation) {
		this.originLocation = originLocation;
	}

	public Location getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public Specie getSpecie() {
		return specie;
	}

	public void setSpecie(Specie specie) {
		this.specie = specie;
	}
}