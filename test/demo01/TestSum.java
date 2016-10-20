package demo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSumTwoNumbers() {
		assertEquals(4, sum(3,1));
	}
	
	@Test
	public void testSumANumberAndZero() {
		assertEquals(6, sum(6,0));
		assertEquals(6, sum(0,6));

	}

	private int sum(int i, int j) {
		return i+j;
	}

}
