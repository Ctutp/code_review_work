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
        return a * b;
    }

    public int solver(){
        int x = 5;
        int y = 67;
        int xSquared = times(x, x);
        int ySquared = times(y, y);
        int numerator = add(xSquared, ySquared);
        int denominator = dif(x, y);

        return div(numerator, denominator);
    }
}