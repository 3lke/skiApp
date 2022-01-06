package com.accenture.villakunterbunt.sos;



public class App {

    public static void main(String[] args) {

        Animal a2 = new Animal("Horse");
        a2.name = "Horse";

        Animal[] animal2 = new Animal[] {
                new Animal("Dog"), a2
        };

        for (Animal aaa: animal2) {
            aaa.printName();
        }

        String[] animals = {
                "Dog",
                "Jelly Fish",
                "Elephant",
                "Tiger",
                "Lion",
                "Cobra"
        };

        boolean run = true;
        int counter = 0;

        while (run) {
            if (counter == 3) {
                run = false;
            }
            System.out.println(animals[counter]);
            counter++;
        }

        // loops
        // for
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        // foreach
        for (String animal: animals) {
            System.out.println(animal);
        }

        // Wenn...dann (conditional statements)
        if (animals.length == 6) {
            System.out.println("Array has the corret size");
        } else if(animals.length == 5) {
            System.out.println("its only five");
        } else {
            System.out.println("Something else");
        }

        int x = 5;
        switch(x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("something else");
        }



    }

}
