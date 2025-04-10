package com.xworkz.Object.toString;

public class Podcast {
    private String title;
    private String host;
    private int episodes;

    public Podcast(String title, String host, int episodes) {
        this.title = title;
        this.host = host;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Podcast{title='" + title + "', host='" + host + "', episodes=" + episodes + "}";
    }
}
