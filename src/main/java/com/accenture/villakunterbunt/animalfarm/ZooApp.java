package com.accenture.villakunterbunt.animalfarm;

import java.util.ArrayList;

public class ZooApp {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Predator predator = new Predator();
        Animal a2 = new Cat();
        Animal a3 = new Cat();
        Animal a4 = new Tiger();

        AnimalStorage storage = new AnimalStorage();
        storage.addAnimal(animal);
        storage.addAnimal(predator);
        storage.addAnimal(a2);
        storage.addAnimal(a3);

        ArrayList<Animal> animals = storage.getAnimals();
        for (Animal a: animals) {
           a.breath();
        }
    }

}
