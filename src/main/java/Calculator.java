public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return  a * b;
    }
    public int solver(){
        //24 * (8 - 5) + 12 / 3
        return (add(times(24, dif(8, 5)), div(12, 3)));
    }
}
