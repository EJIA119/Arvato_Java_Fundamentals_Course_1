package com.arvato.yeejia.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCourseNoOne {

	
	
	@Test
	public void test() {
		CourseNoOne yourClass = new CourseNoOne();
		yourClass.startWork("worker no1", new Object());
		
	}
	
	@Test
	public void testProcess() {
		CourseNoOne yourClass = new CourseNoOne();

		assertTrue("Test 1".equals(yourClass.process(1)));
		
		assertTrue(yourClass.process(1).equals("Test 1"));
		
		assertFalse("Test 2".equals(yourClass.process(1)));

	}

}
