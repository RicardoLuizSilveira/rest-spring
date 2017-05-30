package com.example.firstRest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstRest.model.Message;



@RestController
public class MessageController {
	
	private static final String template = "Message: %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/message")
	public Message message(@RequestParam(value ="name", defaultValue="standard message") String msg){
		
		return new Message(counter.incrementAndGet(), String.format(template, msg));
	}

}
