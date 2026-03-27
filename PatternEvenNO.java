public class PatternEvenNO {
    public static void main(String[] arg) {
        int n = 2;
        int i;
        int j;
        for (i = 1; i <= 4; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(n+" ");
                n += 2;
            }
            System.out.println();
        }
        for(i=3;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(n+" ");
                n+=2;
            }
            System.out.println();
        }
    }
}