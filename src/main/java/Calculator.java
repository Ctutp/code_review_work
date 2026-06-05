public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b != 0) {return a / b;} else { return 0000;}
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c){
        int d = add(times(a, b), c);
        return d;
    }
}
