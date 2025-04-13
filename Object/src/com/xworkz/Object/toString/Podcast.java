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
    @Override
    public int hashCode() {
        return 59;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Podcast) {
                System.out.println("Comparing!!!!!!");
                Podcast podcast = this;
                Podcast podcast1 = (Podcast) obj;
                if (podcast.title.equals(podcast1.title) && podcast.host.equals(podcast1.host)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
