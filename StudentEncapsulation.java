public class StudentEncapsulation {
    private String studentName;
    private int marks;
    private char grade;

    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String str) {
        studentName = str;
    }

    public int getmarks() {
        return marks;
    }

    public void setmarks(int n) {
        marks = n;
    }

    public char getgrade() {
        return grade;
    }

    public void setgrade(char ch) {
        grade = ch;
    }

    public static void main(String args[])
    {
        StudentEncapsulation obj = new StudentEncapsulation();
        obj.setstudentName("Meenakshi");
        obj.setmarks(91);
        obj.setgrade('A');
        System.out.println(""+ obj.getstudentName() + "Has secured "+ obj.getmarks()+ " and "+ obj.getgrade()+ " Grade");
    }
}