package com.accenture.villakunterbunt.animalfarm;

public class Cat extends Predator {

    @Override
    void breath() {
        // super.breath();
        System.out.println("............");
    }

    void sound() {
        System.out.println("miau miau");
    }

    void sneak() {
        System.out.println("tippel tippel tapp tapp tapp");
    }
}
