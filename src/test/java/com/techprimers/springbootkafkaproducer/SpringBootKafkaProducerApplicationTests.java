package com.techprimers.springbootkafkaproducer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringBootKafkaProducerApplicationTests {

	int a = 20; int b = 21;

	@Test
	public void testAAndBEqualsCheckInDemoBranch() {
		assertEquals(a, b);
	}
}
