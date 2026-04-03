class Prime {
    public String prime(int n)
    {
        int i,count=0;
        for(i=1;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
        if(count<=2)
            return "Prime";
        return "Not Prime";
    }
}

public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Prime p = new Prime();
        String result = p.prime(6);
        System.out.println(result);
    }
}