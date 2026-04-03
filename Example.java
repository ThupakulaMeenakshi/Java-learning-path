class ClassExample {
    String name;

    ClassExample() {
        name = "Meenakshi";
        System.out.println("Object is created!");
    }

    void display() {
        System.out.println(name);
    }
}

public class Example {
    public static void main(String[] arg) 
    {
        ClassExample EX1 = new ClassExample();
        EX1.display();
    }
}