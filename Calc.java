class Calculator {
    int a;
    int b;

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    void mul(int a, int b) {
        System.out.println(a * b);
    }
}

public class Calc {
    public static void main(String[] arg) {
        Calculator c1 = new Calculator();

        c1.add(5,5);
        c1.sub(5,3);
        c1.mul(6,4);
    }
}