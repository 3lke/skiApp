package com.accenture.villakunterbunt.animalfarm;

import java.util.ArrayList;

public class AnimalStorage {

    private ArrayList<Animal> animals = new ArrayList<>();

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
