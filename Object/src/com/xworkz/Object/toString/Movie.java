package com.xworkz.Object.toString;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', director='" + director + "', duration=" + duration + "}";
    }
    @Override
    public int hashCode() {
        return 50;
    }
}
