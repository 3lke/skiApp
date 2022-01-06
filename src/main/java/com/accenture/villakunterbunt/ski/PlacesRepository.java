package com.accenture.villakunterbunt.ski;

import com.accenture.villakunterbunt.ski.entitties.Place;
import com.accenture.villakunterbunt.ski.entitties.SkiBar;
import com.accenture.villakunterbunt.ski.entitties.SkiLift;

import java.util.ArrayList;

public class PlacesRepository {

    private ArrayList<Place> places = new ArrayList<>();
    private ArrayList<SkiLift> skiLift = new ArrayList<>();
    private ArrayList<SkiBar> skiBar = new ArrayList<>();

    public PlacesRepository() {

//        SkiBar bar1 = new SkiBar();
//        bar1.setServesVeganAlcohol(true);
//        bar1.setServesHotFood(false);
//        bar1.setName("Spicy Nonalcoholic Drinks!");
//        bar1.setAddress("Hauptplatz 1, Mitterwald");
//
//        places.add(bar1);
//
//        SkiBar bar2 = new SkiBar();
//        bar2.setServesVeganAlcohol(true);
//        bar2.setServesHotFood(true);
//        bar2.setName("Apres Ski 360");
//        bar2.setAddress("Theaterweg 25, Mitterwald-Ost");
//
//        places.add(bar2);
//
//        SkiLift lift1 = new SkiLift();
//        lift1.setName("Steierwaldlift");
//        lift1.setAddress("Steigerwald 1, Steigerwald");
//        lift1.setLiftType(SkiLiftType.KABINENLIFT);
//        lift1.setCapacityPerHour(500);
//
//        places.add(lift1);
//
//        SkiLift lift2 = new SkiLift();
//        lift2.setName("Arberlift");
//        lift2.setAddress("Großer Arber 1, Arberland");
//        lift2.setLiftType(SkiLiftType.ANKERLIFT);
//        lift2.setCapacityPerHour(10);
//
//        places.add(lift2);
    }

    public void addPlace(Place place) {
        places.add(place);
    }


    public ArrayList<Place> getPlaces() {
        return places;
    }
    public ArrayList<SkiBar> getSkiBar() {
        return skiBar;
    }
    public ArrayList<SkiLift> getSkiLift() {
        return skiLift;
    }
}
