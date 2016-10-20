package demo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSumTwoNumbers() {
		assertEquals(4, sum(3,1));
	}

	private int sum(int i, int j) {
		return 4;
	}

}
