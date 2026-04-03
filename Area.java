class Rectangle {
    int length;
    int width;

    void area() {
        System.out.println("Area:" + length * width);
    }
}

public class Area {
    public static void main(String[] arg) {
        Rectangle a1 = new Rectangle();
        a1.length = 10;
        a1.width = 2;
        a1.area();
    }
}