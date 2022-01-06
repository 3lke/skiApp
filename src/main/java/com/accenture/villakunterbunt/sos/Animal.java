package com.accenture.villakunterbunt.sos;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println("mjamajam");
    }

    public void printName() {
        System.out.println("name" + name);
    }
}
