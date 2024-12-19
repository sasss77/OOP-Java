// package CONSTRUCTOR;
class Laptop {
    /*
    private properties can be changed outside of the class
    using either Constructor or Setter function
     */
    
    private String brand;  
    private int price;
    private int ram;
    public int discount;

    Laptop() {
        brand = "N/A";
        price = 0;
        ram = 2;
        discount = 10;

    }

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    Laptop(int discount, String brand, int price) {
        this.discount = discount;
        this.brand = brand;
        this.price = price;
    }

    int totalPrice() {
        price = price - ((price * discount) / 100);
        return price;
    }

}

public class ConstructorTask {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("HP", 100000);
        Laptop laptop3 = new Laptop(10, "HP", 100000);
        System.out.println("The total price after discount for laptop1 is  " + laptop1.totalPrice());
        System.out.println("The total price after discount for laptop2 is " + laptop2.totalPrice());
        System.out.println("The total price after discount for laptop3 is " + laptop3.totalPrice());
    }
}
     