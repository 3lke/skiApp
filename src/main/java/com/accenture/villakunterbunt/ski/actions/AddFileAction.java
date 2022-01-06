package com.accenture.villakunterbunt.ski.actions;
import com.accenture.villakunterbunt.ski.PlacesRepository;
import com.accenture.villakunterbunt.ski.entitties.Place;
import com.accenture.villakunterbunt.ski.entitties.SkiBar;
import com.accenture.villakunterbunt.ski.entitties.SkiLift;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFileAction {

    private final PlacesRepository placesRepository;

    public AddFileAction(PlacesRepository placesRepository) {
        this.placesRepository = placesRepository;
    }

    public void execute() throws IOException {
        File file = new File("C:\\Users\\elke.schloegl\\projects\\FileVroni.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);
//        writer.write("Lift/Bar;Name of Place; Address; Type; Capacity per Hour");
//        writer.newLine();

//        for (Place place : placesRepository.getPlaces()){
//            writer.write(place.getName() + ", " + place.getAddress() + ", " );
//            writer.write(",");
//        ;
//        }

        for (Place place : placesRepository.getPlaces()) {
            if (place instanceof SkiLift){
            writer.write("Lift");
            writer.write("; " + place.getName());
            writer.write("; " + place.getAddress());
            writer.write("; " + ((SkiLift) place).getLiftType());
            writer.write("; " + ((SkiLift) place).getCapacityPerHour());
            writer.newLine();
            }
            else if (place instanceof SkiBar){
                writer.write("Bar");
                writer.write("; " + place.getName());
                writer.write("; " + place.getAddress());
                writer.write("; " + ((SkiBar) place).isServesHotFood());
                writer.write("; " + ((SkiBar) place).isServesHotFood());
                writer.newLine();
            }
        }



        writer.flush();
        writer.close();
        fw.close();
    }
}
