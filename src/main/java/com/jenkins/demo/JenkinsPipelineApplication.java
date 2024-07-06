package com.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsPipelineApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsPipelineApplication.class);
	
	@PostConstruct
	public void init(){
		logger.info("Application Started.....................");
	}
	public static void main(String[] args) {
		logger.info("Application Excecuted.....................");
		SpringApplication.run(JenkinsPipelineApplication.class, args);
	}

}
