public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new Exception("Делить на ноль нельзя!")
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a){
        int b = 8;

        int result = dif(a, b);
        int k = div(b, result);

        return k;
    }
}
