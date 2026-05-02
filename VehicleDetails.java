class Vehicle {
    String type;
    int maxSpeed;

    Vehicle(String type, int maxspeed) {
        this.type = type;
        this.maxSpeed = maxspeed;
    }
}

class Car extends Vehicle {
    String modelName;

    Car(String type, int maxspeed, String modelName) {
        super(type, maxspeed);
        this.modelName = modelName;
        System.out.println("Type:" + this.type);
        System.out.println("Speed:" + this.maxSpeed);
        System.out.println("ModelName:" + this.modelName);
    }
}

public class VehicleDetails {
    public static void main(String args[]) {
        Car obj = new Car("Petrol", 200, "Thar");
    }
}