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
	
	@Test
	public void testSumNegativeNumbers() {
		assertEquals(5, sum(8, -3));
		assertEquals(-7, sum(-2, -5));
		
	}
	
	@Test
	public void testSumTresNumeros() {
		assertEquals(12, Sum.sum(8, 1, 3));
	}

	
	private int sum(int i, int j) {
		return Sum.sum(i,  j);
	}

}
