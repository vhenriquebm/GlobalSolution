package com.globalsolution;

import java.util.List;

public class User {
	private String name;
	private int id;
	private List<Occurrence> occurrences;

	public User(String name, int id, List<Occurrence> occurrences) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "User{" + "name='" + name + '\'' + ", id=" + id + '}';
	}

	public List<Occurrence> getOccurrences() {
		return occurrences;
	}

	public void setOccurrences(List<Occurrence> occurrences) {
		this.occurrences = occurrences;
	}
}
