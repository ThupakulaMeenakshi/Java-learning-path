public class NumberButterFly {
    public static void main(String[] arg)
    {
        int i,j,k,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i==1||i==n||j==1||j==i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            int space=2*(n-i);
            for(k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(i==1||i==n||j==1||j==i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                if(i==1||i==n||j==1||j==i)
                    System.out.print(j);
                else    
                    System.out.print(" ");
            }
            int space=2*(n-i);
            for(k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(i==1||i==n||j==1||j==i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}