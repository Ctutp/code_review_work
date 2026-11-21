public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int sum = add(5, 3);
        int multiplication = times(sum, 2);
        return dif(multiplication, 4);
    }
}
