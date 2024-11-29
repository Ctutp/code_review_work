public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int a = 2;
        int b = 9;

        int sum = add(a, b);
        int dif = dif(a, b);
        int times = times(sum, dif);
        int div = div(times, dif);

        return div;
    }
}
