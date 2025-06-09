public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b; 
    }

    public int div(int a, int b) {
        if (b == 0) { 
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, String operation) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "dif":
                return dif(a, b);
            case "div":
                return div(a, b);
            case "times":
                return times(a, b);
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation); 
        }
    }
}

