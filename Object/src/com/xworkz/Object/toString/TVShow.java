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
    @Override
    public int hashCode() {
        return 80;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof TVShow) {
                System.out.println("Comparing!!!!!!");
                TVShow tvShow = this;
                TVShow tvShow1 = (TVShow) obj;
                if (tvShow.title.equals(tvShow1.title) && tvShow.genre.equals(tvShow1.genre) && tvShow.seasons == tvShow1.seasons) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
