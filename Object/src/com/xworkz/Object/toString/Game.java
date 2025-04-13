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
    @Override
    public int hashCode() {
        return 33;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Game) {
                System.out.println("Comparing!!!!!!");
                Game game1 = this;
                Game game2 = (Game) obj;
                if(game1.title.equals(game2.title) && game1.rating == game2.rating) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
