import java.util.HashMap;
import java.util.Map;

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

    // let equation be a * x = b
    public int solver(int a, int b) {
        return div(b, a);
    }
}
