package calculator;

public class Calculator {
    private int result;
    public void add(int a, int b){
        result = a + b;
    }

    public void subtract(int a, int b){
        result = a - b;
    }
    public void multiply(int a, int b){
        result = a * b;
    }

    public void divide(int a, int b){
        result = a / b;
    }

    public int getResult(){
        return result;
    }

}
