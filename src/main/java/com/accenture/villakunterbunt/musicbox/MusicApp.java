package com.accenture.villakunterbunt.musicbox;

import com.accenture.villakunterbunt.musicbox.actions.AddAction;
import com.accenture.villakunterbunt.musicbox.actions.ExitAction;
import com.accenture.villakunterbunt.musicbox.actions.ListAction;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp {

    public static final String ADD = "add";
    public static final String LIST = "list";
    public static final String EXIT = "exit";
    private static final String string = "asdfsadf";

    public static void main(String[] args) {

        System.out.println("Hello World");

        MediaStorage storage = new MediaStorage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hello. What do you want to do? [add, list, exit]");
            String command = scanner.nextLine();

            if (ADD.equals(command)) {
                AddAction action = new AddAction(scanner, storage);
                action.execute();
            } else if (LIST.equals(command)) {
                ListAction action = new ListAction(storage);
                action.execute();
            } else if (EXIT.equals(command)) {
                ExitAction action = new ExitAction();
                action.execute();
            }
        }
    }
}
