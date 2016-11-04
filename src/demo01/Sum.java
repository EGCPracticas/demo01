package demo01;

public class Sum {

	public static int sum(int... nums) {
		int sum = 0;
		for (Integer a: nums) {
			sum += a;
		}
		return sum;
	}

}
