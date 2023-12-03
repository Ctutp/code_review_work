public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
       return a-b;
    }
    public int div(int a, int b)throws Exception{
        if(a==0 || b==0) {
            throw new Exception("Operation cannot be perfomed");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a,  int b, int c) throws Exception{
        return times(a,a)+times(b,b)+add(a,b)+div(a,c)+dif(c,b);
    }
}
