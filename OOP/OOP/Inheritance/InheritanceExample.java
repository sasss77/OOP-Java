// package OOP.Inheritance;
class GrandFather {
    public String lastName;
    private int salary;
    protected boolean hasVehicle;
    String email;

    void displayInfo() {
        System.out.println(email + " " + lastName);
    }
}

// Single level Inheritance
class Father extends GrandFather {
    public String middleName;

    void displayName() {
        System.out.println(middleName + " " + lastName);
    }
}

// Multi level Inheritance
class Child extends Father {
    String collegeName;
}

// Heirarchy -- multiple Children
class Brother extends Father {

}

class Sister extends Father {

}

public class InheritanceExample {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.lastName = "XYZ"; // Child calass automatically acquire attr/function of parent Class
        child1.hasVehicle = true;
        child1.email = "xyz@gmail.com";

        child1.displayInfo();
        child1.displayName();

    }
}
