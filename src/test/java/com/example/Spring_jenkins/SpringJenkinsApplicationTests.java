package com.example.Spring_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	Logger log = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public  contextLoads() {
		log.info("Test case is Executed..!");
		assertEquals(true,true);
	}

}
