package com.day.log;

import org.junit.Test;


public class LogTest {
	
	@Test
	public void testLog(){
		PrintLog log = new PrintLog();
		log.printStartLog();
		log.printEndLog();
	}
}
