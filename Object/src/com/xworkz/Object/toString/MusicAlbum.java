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
    @Override
    public int hashCode() {
        return 52;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof MusicAlbum) {
                System.out.println("Comparing!!!!!!");
                MusicAlbum musicAlbum = this;
                MusicAlbum musicAlbum1 = (MusicAlbum) obj;
                if (musicAlbum.name.equals(musicAlbum1.name) && musicAlbum.artist.equals(musicAlbum1.artist)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
