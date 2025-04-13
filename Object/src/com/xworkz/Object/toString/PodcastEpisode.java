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
    @Override
    public int hashCode() {
        return 60;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof PodcastEpisode) {
                System.out.println("Comparing!!!!!!");
                PodcastEpisode podcastEpisode = this;
                PodcastEpisode podcastEpisode1 = (PodcastEpisode) obj;
                if (podcastEpisode.title.equals(podcastEpisode1.title) && podcastEpisode.duration == podcastEpisode1.duration) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
