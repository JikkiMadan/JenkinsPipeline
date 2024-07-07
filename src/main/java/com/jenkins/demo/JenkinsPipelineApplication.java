package com.jenkins.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsPipelineApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsPipelineApplication.class);
	
	@PostConstruct
	public void init(){
		logger.info("Application Starteddddddddddddddd.....................");
	}
	public static void main(String[] args) {
		logger.info("Application Excecuted.....................");
		SpringApplication.run(JenkinsPipelineApplication.class, args);
		logger.info("JenkinsPipelineApplication Excecution Completed.....................");
	}

}
