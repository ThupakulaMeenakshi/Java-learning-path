class Max {
    public int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }
}

public class MaxOfTwo {
    public static void main(String[] args) {
        Max big = new Max();
        int result = big.max(4, 5);
        System.out.println(result);
    }
}