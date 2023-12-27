package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest2 {
		
	private static final Logger log = LogManager.getLogger(MyTest2.class);
	public static void main(String[] args) {
		
		//System.out.println("Hello");
		log.info("This is info msg");
		log.debug("This is debug msg");
		log.error("this is err msg");
	}
}
