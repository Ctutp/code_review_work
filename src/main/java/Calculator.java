public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            System.out.println("Деление на ноль!");
            return 0;
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int a = 2;
        int b = 5;

        int result = dif(b, a);
        int x = div(b, result);

        return x;
    }
}
