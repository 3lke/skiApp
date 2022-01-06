package com.accenture.villakunterbunt.ski;

import com.accenture.villakunterbunt.ski.actions.AddAction;
import com.accenture.villakunterbunt.ski.actions.AddFileAction;
import com.accenture.villakunterbunt.ski.actions.ExitAction;
import com.accenture.villakunterbunt.ski.actions.ListAction;
import com.accenture.villakunterbunt.ski.entitties.Place;
import com.accenture.villakunterbunt.ski.entitties.SkiBar;
import com.accenture.villakunterbunt.ski.entitties.SkiLift;

import java.io.*;
import java.util.Scanner;

public class SkiApp {

    void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        PlacesRepository placesRepository = new PlacesRepository();


        AddAction addAction = new AddAction(placesRepository, scanner);
        ListAction listAction = new ListAction(placesRepository);
        AddFileAction addFileAction = new AddFileAction(placesRepository);


        File file = new File("C:\\Users\\elke.schloegl\\projects\\FileVroni.csv");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String liftString = sc.nextLine();
            String[] liftArray = liftString.split("; ");
            String barLift = liftArray[0];
            String name = liftArray[1];
            String address = liftArray[2];
            String liftType = liftArray[3];
            String capacity = liftArray[4];
        }


        while (true) {
            System.out.println("Hello. What do you want to do?");
            String command = scanner.nextLine();

            if ("list".equalsIgnoreCase(command)) {
                listAction.execute();
            } else if ("add".equalsIgnoreCase(command)) {
                addAction.execute();
            } else if ("exit".equalsIgnoreCase(command)) {
                new ExitAction().execute();
            } else if ("file".equalsIgnoreCase(command)) {
                addFileAction.execute();
            }
        }

    }

    public static void main(String[] args) throws IOException {
        SkiApp skiApp = new SkiApp();
        skiApp.run();
    }
}
