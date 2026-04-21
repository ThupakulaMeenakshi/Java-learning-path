public class CountArray {
    public static void main(String args[])
    {
        int a[] = {12,56,45,78,12,69,12};
        int Target = 12;
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(Target==a[i])
                count++;
        }
        System.out.println("The target value is:" + Target +" "+ "Count is:" + count);
    }
}