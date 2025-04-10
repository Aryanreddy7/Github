package com.xworkz.Object.toString;

public class TVShow {
    private String title;
    private int seasons;
    private String genre;

    public TVShow(String title, int seasons, String genre) {
        this.title = title;
        this.seasons = seasons;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "TVShow{title='" + title + "', seasons=" + seasons + ", genre='" + genre + "'}";
    }
}
