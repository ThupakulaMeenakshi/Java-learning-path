public class CopyArray {
    public static void main(String[] args)
    {
        int a[] = {23,89,45,36,45,26};
        int b[] = new int[a.length];
        for(int i = 0; i < a.length ; i++)
        {
            b[i] = a[i];
                System.out.print(" " + b[i]);
        }
    }
}