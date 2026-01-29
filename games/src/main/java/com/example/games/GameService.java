package com.example.games;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private final List<Game> games = new ArrayList<>();

    public GameService() {
        games.add(new Game(
            "image.png",
            "The Witcher 3",
            "PC",
            0,
            "N/A",
            "https://store.steampowered.com/app/292030"
        ));

        games.add(new Game(
            "image.png",
            "Elden Ring",
            "PS5",
            1,
            "N/A",
            "https://www.playstation.com/fr-fr/games/elden-ring/"
        ));

        games.add(new Game(
            "image.png",
            "The Legend of Zelda: Breath of the Wild",
            "Switch",
            5,
            "N/A",
            "https://store.nintendo.fr/fr/the-legend-of-zelda-breath-of-the-wild-70010000000023"
        ));
    }

    public List<Game> getAllGames() {
        return games;
    }

    public void addGame(Game game) {
        games.add(game);
    }
}