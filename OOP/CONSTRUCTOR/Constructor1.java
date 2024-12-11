class CarClass {
    private int year; // default 0
    private String brand;  //default null
    boolean electric; //default false

    //Constructor -- Functions that runs on oject creation
    // function with same name as class
    //1.non paramaterized constructor
    CarClass() {
        System.out.println("Non param constructor");
    }
    //2.param constructor
    CarClass(int year) {
        // CarClass var = new CarClass();
        System.out.println("Param Constructor");
    }
    //overloading can make functions wit csamme name but different in 
    //1. no of parameter 2. datatype/order of parameter
}
public class Constructor1 {
    public static void main(String[] args) {
        CarClass car1 = new CarClass();
        CarClass car2 = new CarClass(2010);
    }
}
