public class CheckEvenOddArray {
    public static void main(String args[])
    {
        int a[] = {12,45,67,32,11,24};
        int Even = 0;
        int Odd = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]%2==0)
                Even++;
            else
                Odd++;
        }
        System.out.print("Even:" + Even +" "+ "Odd:" + Odd);
    }
}