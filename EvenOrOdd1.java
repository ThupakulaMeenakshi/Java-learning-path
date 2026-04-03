class EvenOrOdd {
    public String evenorodd(int n) {
        if (n % 2 == 0)
            return "even";
        else
            return "odd";
    }
}

public class EvenOrOdd1 {
    public static void main(String[] args) {
        EvenOrOdd eve = new EvenOrOdd();
        String result = eve.evenorodd(5);
        System.out.println(result);
    }
}