class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println(brand + " " + speed);
    }
}

public class Details {
    public static void main(String[] arg) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 120;

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.speed = 150;

        c1.showDetails();
        c2.showDetails();

    }
}