package com.mavenKafka;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {

	@Test
	public void test() {
		App app1 = new App();
		
		assertEquals("CD",app1.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",app1.truncateAInFirst2Positions("ACD"));
		assertEquals("CDAA",app1.truncateAInFirst2Positions("CDAA"));
	}

}
