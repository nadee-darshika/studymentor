package com.studymentor.studymentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.studymentor.studymentor")
public class StudymentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudymentorApplication.class, args);
	}

}
