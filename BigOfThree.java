public class BigOfThree {
    public static void main(String s[]) {
        int a = 5;
        int b = 8;
        int c = 12;

        if (a > b && a > c)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}