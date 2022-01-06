package com.accenture.villakunterbunt.musicbox.actions;

import com.accenture.villakunterbunt.musicbox.Media;
import com.accenture.villakunterbunt.musicbox.MediaStorage;

public class ListAction {

    private MediaStorage storage;

    public ListAction(MediaStorage storage) {
        this.storage = storage;
    }

    public void execute() {
        for (Media media : storage.getMedias()) {
            System.out.println("Media: " + media.getArtist() + " -> " + media.getTitle());
        }
    }
}
