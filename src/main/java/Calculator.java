public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(int a, int b, String operation){
        int result = 0;
        switch(operation) {
            case "add":
                result = add(a, b);
                break;
            case "dif":
                result = dif(a, b);
                break;
            case "div":
                result = div(a, b);
                break;
            case "times":
                result = times(a, b);
                break;
            default:
                System.out.println("Operation not supported");
        }
        return result;
    }
}
