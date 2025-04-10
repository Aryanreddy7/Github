package com.xworkz.Object.toString;

public class MusicAlbum {
    private String name;
    private String artist;
    private int year;

    public MusicAlbum(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicAlbum{name='" + name + "', artist='" + artist + "', year=" + year + "}";
    }
}
