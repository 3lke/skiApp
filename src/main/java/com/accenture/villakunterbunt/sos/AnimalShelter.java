package com.accenture.villakunterbunt.sos;

public class AnimalShelter {

    Animal[] animals = {
            new Animal("Dog"),
            new Animal("Jelly Fish"),
            new Animal("Elephant"),
            new Animal("Tiger"),
            new Animal("Lion"),
            new Animal("Cobra")
    };

    public AnimalShelter() {
    }

    public void feed() {
        for (Animal a: animals) {
            a.feed();
        }
    }
}
