package com.example.games;

public class Game {
    
    private String image;
    private String title;
    private String platform;
    private int stars;
    private String description;
    private String link;

    public Game(String image, String title, String platform, int stars, String description, String link) {
        this.title = title;
        this.platform = platform;
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public int getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }
    
    public String getLink() {
        return link;
    }
}
