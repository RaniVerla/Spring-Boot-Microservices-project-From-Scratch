package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

	
	static Logger log=LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test case executed .... ");
		assertEquals(true, true);
	}

}
