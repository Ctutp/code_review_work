public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int dif(int a, int b) {
		return a - b;
	}

	public int div(int a, int b) throws IllegalAccessException {
		int result = 0;
		if (b == 0) {
			throw new IllegalAccessException("Error div 0!");
		} else result = a - b;
		return result;
	}

	public int times(int a, int b) {
		return a * b;
	}

	public int solver() {
		return 228;
	}
}
