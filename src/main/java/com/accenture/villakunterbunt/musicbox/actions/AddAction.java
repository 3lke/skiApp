package com.accenture.villakunterbunt.musicbox.actions;

import com.accenture.villakunterbunt.musicbox.Media;
import com.accenture.villakunterbunt.musicbox.MediaStorage;

import java.util.Scanner;

public class AddAction {

    private Scanner scanner;
    private MediaStorage storage;

    public AddAction(Scanner scanner, MediaStorage storage) {
        this.scanner = scanner;
        this.storage = storage;
    }

    public void execute() {
        System.out.println("What artist?");
        String artist = scanner.nextLine();

        System.out.println("What title?");
        String title = scanner.nextLine();

        System.out.println("What label?");
        String label = scanner.nextLine();

        System.out.println("What genre?");
        String genre = scanner.nextLine();

        Media media = new Media();
        media.setArtist(artist);
        media.setGenre(genre);
        media.setTitle(title);
        media.setLabel(label);

        storage.addMedia(media);
    }

}
