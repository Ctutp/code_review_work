import static java.lang.Integer.sum;

public class Calculator {
    public int add(int a, int b){
        return sum(a,b);
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
       int x = 10;
       int a = -2;

       int y = 8;
       int b = 4;

       return dif(div(times(x, x), times(a, a)), div(times(y,y),times(b,b)));
    }
}
