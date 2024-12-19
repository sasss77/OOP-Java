class Parent {
    Parent() { 
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
            super(); 
            System.out.println("Child class constructor");
        }
}

public class Testtt {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}

