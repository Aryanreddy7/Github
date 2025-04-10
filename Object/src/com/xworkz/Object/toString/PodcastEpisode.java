package com.xworkz.Object.toString;

public class PodcastEpisode {
    private String title;
    private String guest;
    private int duration;

    public PodcastEpisode(String title, String guest, int duration) {
        this.title = title;
        this.guest = guest;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "PodcastEpisode{title='" + title + "', guest='" + guest + "', duration=" + duration + "}";
    }
}
