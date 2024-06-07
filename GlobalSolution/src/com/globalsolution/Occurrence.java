package com.globalsolution;

public class Occurrence {
	private int id;
	private String description;
	private int animalSpeciesId;
	private int userId;

	public Occurrence(int id, String description, int animalSpeciesId, int userId) {
		this.id = id;
		this.description = description;
		this.animalSpeciesId = animalSpeciesId;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAnimalSpeciesId() {
		return animalSpeciesId;
	}

	public void setAnimalSpeciesId(int animalSpeciesId) {
		this.animalSpeciesId = animalSpeciesId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Occurrence{" + "id=" + id + ", description='" + description + '\'' + ", animalSpeciesId="
				+ animalSpeciesId + ", userId=" + userId + '}';
	}
}
