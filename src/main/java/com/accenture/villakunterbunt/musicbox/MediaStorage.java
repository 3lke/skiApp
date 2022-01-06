package com.accenture.villakunterbunt.musicbox;

import java.util.ArrayList;

public class MediaStorage {

    private ArrayList<Media> medias = new ArrayList<>();

    public void addMedia(Media media) {
        if (media == null) {
            System.out.println("media must not be null");
            return;
        }
        medias.add(media);
    }

    Media findFirstMediaByArtistWithPrefix(String prefix) {
        for (Media media: medias) {
            if (media.getArtist().startsWith(prefix)) {
                return media;
            }
        }

        return null;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }
}
