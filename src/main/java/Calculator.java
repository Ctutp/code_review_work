public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){

        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");

        }
        return a / b;

    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){

        return times(add(9,10),dif(10,9))-div(add(9,10),9);

    }
}