package com.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPipelineApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsPipelineApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test Cases executing .......................... ");
		assertEquals(true,true);
	}

}
