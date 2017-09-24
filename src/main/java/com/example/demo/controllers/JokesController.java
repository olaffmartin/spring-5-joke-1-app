package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.JokeService;

@Controller
public class JokesController {

	private JokeService jokeService;

	public JokesController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
}
