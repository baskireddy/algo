package com.github.baskireddy.util;

import org.junit.Test;

public class UtilsTest {

	
	@Test
	public void testLongArraySizeMatchesRequest() {
		Utils util = new Utils();
		Integer[] l = util.randomInts(5);
		for(int i = 0;i<l.length;i++) {
			System.out.println(l[i]);
		}
	}

	
	@Test
	public void testArrayIsSorted() {
		Utils util = new Utils();
		Integer[] l = util.sortedRandomInts(5);
		for(int i = 0;i<l.length;i++) {
			System.out.println(l[i]);
		}
	}
	
}
