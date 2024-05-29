public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        return add(2, 3) - dif(5, 2) + div(10, 2) * times(3, 4);
    }
}
