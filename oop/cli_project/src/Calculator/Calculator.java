package Calculator;

public class Calculator {
    int totalResult;

    public Calculator() {
        totalResult = 0;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(200, 100);
        System.out.println("sum total result: " + cal.totalResult);
        cal.div(300, 100);
        System.out.println("total div: " + cal.totalResult);
        cal.mod(200, 100);
        System.out.println("total mod:" + cal.totalResult);
        cal.mul(10, 20);
        System.out.println("The total mul : " + cal.totalResult);
        cal.sub(200, 50);
        System.out.println("Subtraction : " + cal.totalResult);
        cal.fact(5);
        System.out.println("The factorial OF THE NUMBER IS : " + cal.fact());
    }

    private void sum(int a, int b) {
        this.totalResult = a + b;
    }

    private void div(int a, int b) {
        this.totalResult = a / b;
    }

    private void mul(int a, int b) {
        this.totalResult = a * b;
    }

    private void mod(int a, int b) {
        this.totalResult = a % b;
    }

    private void sub(int a, int b) {
        this.totalResult = a - b;
    }

    private int fact(int n) {

        if (n == 1)
            return 1;
        else
            return n * (fact(n - 1));
    }
}