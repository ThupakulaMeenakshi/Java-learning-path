class StudentClass {
    int Marks;
    String name;

    void display() {
        System.out.println(name + " " + Marks);
    }
}

public class Student {
    public static void main(String[] arg) {
        StudentClass s1 = new StudentClass();
        s1.name = "Meenakshi";
        s1.Marks = 95;
        s1.display();
    }
}