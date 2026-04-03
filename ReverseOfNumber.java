class ReverseNumber {
    public int reversenumber(int n) {
        int rem, rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }
}

public class ReverseOfNumber {
    public static void main(String[] args) {
        ReverseNumber r = new ReverseNumber();
        int result = r.reversenumber(123);
        System.out.println(result);
    }
}