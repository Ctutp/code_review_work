public class Calculator {
    public int add(int a, int b){
        int c = a+b;
        return c;
    }
    public int dif(int a, int b){
        int c = a-b;
        return c;
    }
    public int div(int a, int b){
        int c = a/b;
        return c;
    }
    public int times(int a, int b){
        int c = a*b;
        return c;
    }
    public int solver(int n){ //factorial
        int c = 1;
        for (int i = 1; i <= n; i++){
            c = times(c,i);
        }
        return c;
    }
}
