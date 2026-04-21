public class MaxOfArray {
    public static void main(String args[]) {
        int num[] = { 25, 14, 56, 78, 15 };
        int max = num[0];
        for (int i = 0; i < num.length; i++) 
        {
            if(num[i] > max)
            {
                max = num[i];
            }
        }
        System.out.println(max);
    }
}