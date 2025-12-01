public class Calculator {
    public int add(int x, int y){
        return x + y;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Нельзя делить на 0");
        }
        return a / b;
    }

    public int times(int a, int b){
        return (int) Math.pow(a, b);
    }

    public int solver(){
        // Текущая логика: 2^4 + 6/2 = 16 + 3 = 19
        // Можно изменить на что-то другое, например:
        return add(times(2, 3), div(10, 2));  // 2^3 + 10/2 = 8 + 5 = 13

    }
}
