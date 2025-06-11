package com.timhortons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TimhortonsSurveyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimhortonsSurveyAppApplication.class, args);
	}

}
