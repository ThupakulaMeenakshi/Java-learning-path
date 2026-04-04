class CountDigit {
    public int countdigit(int n) {
        if (n==0)
            return 1;
        int temp = 0;
        while(n!=0) 
        {
            n = n / 10;
            temp++;
        }
        return temp;
    }
}

public class CountDigits 
{
    public static void main(String[] args) 
    {
        CountDigit c = new CountDigit();
        int result = c.countdigit(0);
        System.out.println(result);
    }
}
