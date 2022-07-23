package com.nagp.quotes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/quotes")
public class QuotesController {
	public static List<String> quotes;
	static  {
		quotes = new ArrayList<String>();
		quotes.add("Early to bed, Early to rise, Makes you healthy wealthy and wise");
		quotes.add("An apple a day, keeps doctors away");
		quotes.add("Slow and steady wins the race");
		quotes.add("One in hand is better then two in bush");
	}

	@GetMapping("/all")
	public List<String> getQuotes(){
		return quotes;
	}
	
	@GetMapping("/random")
	public String getRandomQuotes(){
		return quotes.get(new Random().nextInt(quotes.size()));
	}
}
