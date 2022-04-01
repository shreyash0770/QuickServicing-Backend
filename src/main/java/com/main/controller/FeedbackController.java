package com.main.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Feedback;
import com.main.model.ShipmentService;
import com.main.repository.FeedbackReository;

@CrossOrigin(origins = "http://localhost:3000" )
@RestController
@RequestMapping("/")
public class FeedbackController {
	
	@Autowired
	private FeedbackReository feedbackrepo;
	
	//get all the feedback
	@GetMapping("/Feedback")
	public List<Feedback> getallfeedback(){
		
		return feedbackrepo.findAll();
	}
	
	@PostMapping("/Feedback")
	public Feedback createfeedback(@RequestBody Feedback feedback )
	{
		return feedbackrepo.save(feedback);
	}
	
	
	
	

}
