class Phone {
    String brand;
    Phone(String brand)
    {
        this.brand = brand;
    }
}

class SmartPhone extends Phone {
    String model;

    SmartPhone(String brand , String model)
    {
        super(brand);
        this.model = model;
        System.out.println(this.brand + ":" + model);
    }
}
public class SuperThisConstructor {
    public static void main(String args[]) {
        SmartPhone obj = new SmartPhone("Android","smartPhone" );
    }
}