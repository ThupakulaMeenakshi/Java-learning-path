public class FindDuplicateArray {
    public static void main(String args[]) {
        int a[] = { 45, 89, 45, 12, 65, 98, 45, 12, 65 };
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j])
                    System.out.println("Duplicate is:" + a[i]);
            }
        }
    }
}