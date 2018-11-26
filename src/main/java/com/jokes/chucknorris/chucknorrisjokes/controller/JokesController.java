package com.jokes.chucknorris.chucknorrisjokes.controller;

import com.jokes.chucknorris.chucknorrisjokes.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
