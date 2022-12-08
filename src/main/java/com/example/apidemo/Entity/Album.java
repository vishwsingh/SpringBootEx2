package com.example.apidemo.Entity;

public class Album {

    private int number_of_Songs;
    private String artist;
    private String genre;

    public Album() {
    }

    public Album(int number_of_Songs, String artist, String genre) {
        this.number_of_Songs = number_of_Songs;
        this.artist = artist;
        this.genre = genre;
    }

    public int getNumber_of_Songs() {
        return number_of_Songs;
    }

    public void setNumber_of_Songs(int number_of_Songs) {
        this.number_of_Songs = number_of_Songs;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
