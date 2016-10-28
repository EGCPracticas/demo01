package demo01;

public class Sum {

	public static int sum(int i, int j) {
		return i+j;
	}

	public static Object sum(int i, int j, int k) {
		return sum(sum(i, j), k);
	}
}
