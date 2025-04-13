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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Movie) {
                System.out.println("Comparing!!!!!!");
                Movie movie = this;
                Movie movie1 = (Movie) obj;
                if (movie.title.equals(movie1.title) && movie.duration == movie1.duration) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
