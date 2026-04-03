class StudentMarks {
    String name;
    int marks;

    void CheckPass() {
        if (marks >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}

public class Check {
    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks();
        s1.name = "Meenakshi";
        s1.marks = 65;
        
        StudentMarks s2 = new StudentMarks();
        s2.name = "Meenakshi";
        s2.marks = 39;
        s1.CheckPass();
        s2.CheckPass();


    }
}