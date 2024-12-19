class ParentClass {
    String firstName;

    ParentClass() {
        System.out.println("Parent Class non param Constructor");
    }

    ParentClass(int num1) {
        System.out.println("Parent Class param Constructor");
    }
}

class ChildClass extends ParentClass {
    String firstName = "Child's Name";

    void diff(String firstName) {
        System.out.println(firstName);
        System.out.println(this.firstName);
        System.out.println(super.firstName);
    }

    ChildClass() {

        super(10); // Automatically called if not defined
        System.out.println("Child Class non param Constructor");
    }

    ChildClass(int nm2) {
        System.out.println("Child Class Param Constructor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass(12);
        c1.diff("Parent's Name");
    }
}
