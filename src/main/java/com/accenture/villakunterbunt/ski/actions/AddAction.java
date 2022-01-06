package com.accenture.villakunterbunt.ski.actions;

import com.accenture.villakunterbunt.ski.PlacesRepository;
import com.accenture.villakunterbunt.ski.SkiLiftType;
import com.accenture.villakunterbunt.ski.entitties.SkiBar;
import com.accenture.villakunterbunt.ski.entitties.SkiLift;

import java.util.Scanner;

public class AddAction {

    public static final String BAR = "bar";
    public static final String LIFT = "lift";

    private final PlacesRepository placesRepository;
    private final Scanner scanner;

    public AddAction(PlacesRepository placesRepository, Scanner scanner) {
        this.placesRepository = placesRepository;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.println("What do you want to add? [lift, bar]");
        String typeOfPlace = scanner.nextLine();

        if (BAR.equalsIgnoreCase(typeOfPlace)) {
            addBar();
        } else if (LIFT.equalsIgnoreCase(typeOfPlace)) {
            addLift();
        }
    }

    private void addLift() {

        System.out.println("What is the name of this lift?");
        String liftName = scanner.nextLine();

        System.out.println("What is the address of this lift?");
        String address = scanner.nextLine();

        System.out.println("What is the capacity per hour of this lift?");
        String capacityAsString = scanner.nextLine();

        System.out.println("What is the lift type [ ANKERLIFT, SESSELIFT, KABINENLIFT, TELLERLIFT ]?");
        String liftTypeAsString = scanner.nextLine();

        SkiLift lift = new SkiLift();
        lift.setName(liftName);
        lift.setAddress(address);
        lift.setCapacityPerHour(Integer.parseInt(capacityAsString));
        lift.setLiftType(SkiLiftType.valueOf(liftTypeAsString));

        placesRepository.addPlace(lift);
    }

    private void addBar() {
        System.out.println("What is the name of this bar?");
        String name = scanner.nextLine();

        System.out.println("What is the address of this bar?");
        String address = scanner.nextLine();

        System.out.println("Does the bar serve hot food [true|false]?");
        String servesHotFoodAsString = scanner.nextLine();

        System.out.println("Does the bar serve vegan alcohol [true|false]?");
        String servesVeganAlcoholAsString = scanner.nextLine();

        SkiBar bar = new SkiBar();
        bar.setAddress(address);
        bar.setName(name);
        bar.setServesHotFood(Boolean.parseBoolean(servesHotFoodAsString));
        bar.setServesVeganAlcohol(Boolean.parseBoolean(servesVeganAlcoholAsString));

        placesRepository.addPlace(bar);
    }
}
