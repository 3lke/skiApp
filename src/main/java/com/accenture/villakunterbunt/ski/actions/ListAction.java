package com.accenture.villakunterbunt.ski.actions;

import com.accenture.villakunterbunt.ski.PlacesRepository;
import com.accenture.villakunterbunt.ski.entitties.Place;

import java.util.ArrayList;

public class ListAction {

    private PlacesRepository placesRepository;

    public ListAction(PlacesRepository placesRepository) {
        this.placesRepository = placesRepository;
    }

    public void execute() {
        ArrayList<Place> places = placesRepository.getPlaces();

        for (Place place : places) {
            System.out.println(place);
        }

    }
}
