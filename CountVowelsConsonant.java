public class CountVowelsConsonant {
    public static void main(String args[])
    {
        String s = "Meenakshi";
        s = s.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        for(int i = 0; i <s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u')
                vCount++;
            else
                cCount++;
        }
        System.out.println("Vowel:" + vCount + " " + "Consonant:" + cCount);
    }
}