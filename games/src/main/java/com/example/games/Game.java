package com.example.games;

public class Game {
    
    private String title;
    private String platform;
    private String description;
    private String link;

    public Game(String title, String platform, String link) {
        this.title = title;
        this.platform = platform;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDescription() {
        return description;
    }
    
    public String getLink() {
        return link;
    }
}
