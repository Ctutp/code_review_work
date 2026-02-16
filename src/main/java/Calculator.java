public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int x = add(10, 10);
        int y = dif(20, 15);
        int z = div(x, y);
        return z;
    }
}