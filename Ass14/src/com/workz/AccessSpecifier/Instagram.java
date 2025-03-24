package com.workz.AccessSpecifier;

public class Instagram {
    public int followers;
    private String username;
    int likes;

    public void follow(){
        this.username="_aryanreddy_";
        System.out.println("Running follow"+this.username);
    }
    private void unfollow(){
        System.out.println("Running Unfollow");
    }
    void block(){
        unfollow();
        System.out.println("Running block"+this.likes);
    }
}
