package com.accenture.villakunterbunt.musicbox;


/**
 * public
 * <package scoped>
 * private
 * protected
 *
 * POJO: Plain old java objects
 * (Entity, Entität)
 */
public class Media {

    private String title;
    private String artist;
    private String genre;
    private String label;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getLabel() {
        if (label == null) {
            return "independent";
        }
        return label;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // MetallicaIntheWoods
    // MetallicaI...
    public void setArtist(String artist) {
        if (artist.length() > 10) {
            artist = artist.substring(0, 10) + "...";
        }
        this.artist = artist;
    }

    public void setGenre(String genre) {
        if (genre == null) {
            genre = "Electronika";
        }
        this.genre = genre;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
