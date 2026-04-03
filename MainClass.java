class GreetMethod {
    public void greet() {
        System.out.println("Hello World");
    }
}

public class MainClass {
    public static void main(String[] args) {
        GreetMethod g = new GreetMethod();
        g.greet();
    }
}