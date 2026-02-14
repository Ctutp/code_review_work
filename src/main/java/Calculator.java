public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    
    public int dif(int a, int b){
        return a - b;
    }
    
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Делить на 0 нельзя!");
        }
        return a / b;
    }
    
    public int times(int a, int b){
        return a * b;
    }
    
    public int solver(){
        // уравнение: ((74 + 985) * 92 - 26) / 56
        int sum = add(74, 985);
        int product = times(sum, 92);
        int difference = dif(product, 26);
        int result = div(difference, 56);
        return result;
    }
}
