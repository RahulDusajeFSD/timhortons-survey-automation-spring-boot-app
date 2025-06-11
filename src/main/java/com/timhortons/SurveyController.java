package com.timhortons;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/th-survey")
public class SurveyController {

	
	private SurveyService surveyService;
	
	public SurveyController(SurveyService surveyService) {  // constructor Injection 
		this.surveyService = surveyService;
	}
	
	

	@GetMapping("/submit")
	public CompletableFuture<String> submitSurvey(@RequestParam String surveyCode, @RequestParam String employeeName) {
	    return surveyService.submitSurveyAsync(surveyCode, employeeName);
	}
	
		
}
