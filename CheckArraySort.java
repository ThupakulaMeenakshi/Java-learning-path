public class CheckArraySort {
    public static void main(String args[])
    {
        int a[] = {10,20,30,40,50,60};
        boolean IsSorted = true;
        for(int i = 0; i<a.length-1; i++)
        {
            if (a[i]>a[i+1])
            {
                IsSorted = false;
                break;
            }
        }
        if(IsSorted == true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}