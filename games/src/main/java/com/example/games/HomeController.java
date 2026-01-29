package com.example.games;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final GameService gameService;

    public HomeController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("games", gameService.getAllGames());
        model.addAttribute("game", new Game("", "", ""));
        return "index";
    }

    @PostMapping("/add")
    public String addGame(Game game) {
        gameService.addGame(game);
        return "redirect:/";
    }
    
}