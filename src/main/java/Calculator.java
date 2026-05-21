public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
    public int times(int a, int b){
        return a+b;
    }
    public int solver(int a, int b, int c, int d){
        return add(a,(dif(b,(div(0,(times(c,d)))))));
    }
}