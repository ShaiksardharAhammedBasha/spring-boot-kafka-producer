package com.techprimers.springbootkafkaproducer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringBootKafkaProducerApplicationTests {

	int a = 20; int b = 20;

	@Test
	public void getAAndBValuesCheck() {
		assertEquals(a, b);
	}

	@Test
	public void thirdTestCaseInsideMasterBranch() {
		assertEquals("", "");
	}

}
