package com.xworkz.Object.toString;

public class Game {
    private String title;
    private String genre;
    private double rating;

    public Game(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Game{title='" + title + "', genre='" + genre + "', rating=" + rating + "}";
    }
}
