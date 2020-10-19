package com.simplilearn.ticketGenerator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketGeneratorApplicationTests {
	private TicketGeneratorApplciation Ticketer = new TicketGeneratorApplication();
	@Test
	public void testRandomNumber() {
		assertTrue(ticketer.getRandomTicketNumber()>1000&&.getRandomTicketNumber()<9999)
	}
}

