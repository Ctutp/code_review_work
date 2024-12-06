public class Calculator {
    public int add(int a, int b){
        return  a+b;
    }
    public int dif(int a, int b){
        if (a == 0 && b == 0){
            throw new IllegalArgumentException("даун");
        }
        return a / b;
    }

    public int div(int a, int b) {
        return a - b;
    }


    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int result = add(5, 5); // 10
        result = times(result, 2); // 20
        result = div(result, 2); // 10
        result = dif(result, 4); // 6
        return result;
    }
}
