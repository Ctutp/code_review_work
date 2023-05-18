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
        return this.times(this.div(this.add(15, 10), this.dif(25, 13)), 3);
    }
}
