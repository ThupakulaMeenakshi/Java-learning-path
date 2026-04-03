class Mobile {
    String brand;
    int price;

    void isExpensive() {
        if (price > 50000)
            System.out.println("Expensive");
        else
            System.out.println("Affordable");
    }
}

public class Mob {
    public static void main(String[] arg) {
        Mobile m1 = new Mobile();
        m1.price = 51000;
        Mobile m2 = new Mobile();
        m2.price = 49000;
        m1.isExpensive();
        m2.isExpensive();
    }
}