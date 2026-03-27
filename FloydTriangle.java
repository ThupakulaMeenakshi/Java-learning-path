public class FloydTriangle {
    public static void main(String[] arg) {
        int i;
        int j;
        int n = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}