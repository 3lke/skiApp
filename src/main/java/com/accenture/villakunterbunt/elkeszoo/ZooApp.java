package com.accenture.villakunterbunt.elkeszoo;

import java.util.ArrayList;

public class ZooApp {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.name = "Fuchs";
        Animal a2 = new Animal();
        a2.name = "Fisch";
        Animal a3 = new Animal();
        a3.name = "Katze";

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        Animal[] listOf = new Animal[] {a1, a2, a3, a3, a3};

        //

        Animal[] y = new Animal[ listOf.length + 10 ];
        for (int i = 0; i < listOf.length; i++) {
            y[i] = listOf[i];
        }


        String[][] bla = new String[][] {
               new String[] { "Hammerhai", "Jellyfish", "Anderefisch" },
               new String[] { "Gorilla", "Schwein", "Kuh" },
               new String[] { "Flycatcher", "Swan", "Raven"}
        };

        System.out.println(bla[1][1]);

    }
}
