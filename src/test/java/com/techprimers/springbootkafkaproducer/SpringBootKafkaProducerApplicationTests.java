package com.techprimers.springbootkafkaproducer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest
class SpringBootKafkaProducerApplicationTests {

	int a = 20; int b = 21;

	@Test
	public void testAAndBEqualsCheckInDemoBranch() {
		assertEquals(a, b);
	}

	@Test
	public void testReplacingMasterBranchTestInTestCaseBranch() {
		assertFalse(false);
	}

	@Test
	public void fourthTestCaseInDemoBranch() {
		assertFalse(false);
	}


}
