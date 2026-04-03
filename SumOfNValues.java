class SumOfN 
{
    public int sumofn(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
         return sum;
    }
}

public class SumOfNValues {
    public static void main(String[] args) {
        SumOfN s = new SumOfN();
        int result = s.sumofn(10);
        System.out.println(result);
    }
}