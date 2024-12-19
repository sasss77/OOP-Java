class VehicleClass {
    String brand, name;
    int wheel, price;

    
    VehicleClass(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }
    VehicleClass(String brand, String name, int wheel, int price) {
       super(b)
    }
}

class BikeClass extends VehicleClass {
    String brand, name;

    BikeClass() {
        super("Honda", "XR", 2, 20000);
        this.brand = "N/A";
        this.name = "N/A";
    }

    BikeClass(String brand, String name) {
        super(brand, name);
    }

    BikeClass(String brand, String name, int wheel, int price) {
        super(brand, name, wheel, price);
    }

    
}

public class TaskSuperKeyword {
    public static void main(String[] args) {
        BikeClass c = new BikeClass("Honda", "Panda");
        BikeClass c1 = new BikeClass("Yamaha", "R15", 2, 120000);
        System.out.println(c1.brand + " " + c1.name + " " + c1.price + " " + c1.wheel);
    }
}
