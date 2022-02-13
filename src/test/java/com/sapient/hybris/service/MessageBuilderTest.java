package com.sapient.hybris.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;


class MessageBuilderTest {

	@Test
	void testGetMessageForValidName() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Hello uday",messageBuilder.getMessage("uday"));
	}
	
	@Test
	void testGetMessageForInValidName() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertNotEquals("Hello Admin",messageBuilder.getMessage("uday"));
	}
	
	@Test
	void testGetMessageForNull() {
		MessageBuilder messageBuilder= new MessageBuilder();
		assertEquals("Please provide a name!",messageBuilder.getMessage(null));
	}

}

