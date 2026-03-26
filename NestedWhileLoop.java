public class NestedWhileLoop {
    public static void main(String[] arg) {
        int i = 1;
        while (i <= 4) {
            System.out.println("Hello");
            int j = 1;
            while (j <= 1) {
                System.out.println("Good Morning");
                j++;
            }
            i++;
        }
    }
}