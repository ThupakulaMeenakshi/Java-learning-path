class Palin {
    public int palindrome(int n) {
        int rev=0;
        while (n != 0) 
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
}

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Palin p = new Palin();
        int n = 1331;
        int result = p.palindrome(n);
        if(n == result)
            System.out.println(result + " is a palindrome");
        else
            System.out.println(result+"Not palindrome");
    }
}
