public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0)
            throw new IllegalArgumentException("Нельзя делить на 0");
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        return 2;
    }

}
