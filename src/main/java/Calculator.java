public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
	if b != 0{
		return a / b;
	}
    }
    public int times(int a, int b){
        return x * b;
    }
    public int solver(int a, int b){
        return add(times(a, b), div(a, b))
    }
}
