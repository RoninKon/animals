package com.example.animals;

public class Animal {
    private String name;
    private String animalDescription;
    private String populationSize;
    private int animalResource;

    public Animal(String name, String animalDescription, String populationSize, int animalResource) {
        this.name = name;
        this.animalDescription = animalDescription;
        this.populationSize = populationSize;
        this.animalResource = animalResource;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }

    public int getAnimalResource() {
        return animalResource;
    }

    public void setAnimalResource(int animalResource) {
        this.animalResource = animalResource;
    }
}
