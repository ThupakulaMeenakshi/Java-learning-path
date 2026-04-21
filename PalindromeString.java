public class PalindromeString {
    public static void main(String args[]) {
        String s = "Madam";
        String temp = new String();
        s = s.toLowerCase();
        for (int i = s.length()-1; i >= 0; i--) 
        {
            temp = temp + s.charAt(i);
        }
         if (temp.equals(s))
            System.out.println("palindrome" + " " + temp);
        else
            System.out.println("Not palindrome"+ " " + s);
    }
}