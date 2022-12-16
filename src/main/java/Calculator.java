public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public String solver(double a, double b, double c){
        double D = b*b - 4*a*c;
        String answer = "nan";
        if(D > 0) {
            double x1 = (-b - Math.sqrt(D))/(2*a);
            double x2 = (-b + Math.sqrt(D))/(2*a);
            answer = "x1 : " + x1 + ", x2 : " + x2;
        }
        return answer;
    }
}
