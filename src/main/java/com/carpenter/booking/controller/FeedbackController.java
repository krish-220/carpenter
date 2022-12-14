package com.carpenter.booking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpenter.booking.model.Feedback;
import com.carpenter.booking.service.FeedbackService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")

public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackservice;
	
	@PostMapping("/addfeedback")
	public Feedback addFeedback( @RequestBody Feedback feedback) {
		return feedbackservice.addFeedback(feedback);
	}

	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return feedbackservice.getallFeedback();
	}
}
