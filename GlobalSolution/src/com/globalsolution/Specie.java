package com.globalsolution;

import java.util.List;

import java.util.List;

public class Specie {
    private int id;
    private String scientificName;
    private String commonName;
    private String family;
    private String conservationStatus;
    private Habitat habitat;
    private List<Migration> migrations;

    // Construtor
    public Specie(int id, String scientificName, String commonName, String family, String conservationStatus, Habitat habitat, List<Migration> migrations) {
        this.id = id;
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.family = family;
        this.conservationStatus = conservationStatus;
        this.habitat = habitat;
        this.migrations = migrations;
    }
    
    public Specie() {}

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public List<Migration> getMigrations() {
        return migrations;
    }

    public void setMigrations(List<Migration> migrations) {
        this.migrations = migrations;
    }

    @Override
    public String toString() {
        return "Specie{" +
                "id=" + id +
                ", scientificName='" + scientificName + '\'' +
                ", commonName='" + commonName + '\'' +
                ", family='" + family + '\'' +
                ", conservationStatus='" + conservationStatus + '\'' +
                ", habitat=" + habitat +
                ", migrations=" + migrations +
                '}';
    }
}

