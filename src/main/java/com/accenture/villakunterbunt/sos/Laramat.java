package com.accenture.villakunterbunt.sos;

import java.util.Scanner;

public class Laramat {
    public static void main(String[] args) {

        String[] hoorayNames = new String[] {
            "lara",
            "lisa",
            "marie",
            "elke"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        boolean nameFound = false;
        for (String hoorayName: hoorayNames) {
            if (hoorayName.equals(name)) {
                nameFound = true;
                break;
            }
        }

        if (nameFound) {
            System.out.println("Hooray, this is a hooray name");
        } else {
            System.out.println("oh no, its not hooray name");
        }

    }
}
