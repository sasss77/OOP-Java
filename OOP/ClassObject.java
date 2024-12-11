class StudentDetails {
    String name;
    int age;

    void Display() {
        System.out.printf("Name: %s \nage: %d \n\n", name, age);
    }

}

class Dog {
    String name, breed, color;
    int age;

    void bark() {
        System.out.println(name + " with color "+color + " is barking");
    }

    void eat() {
        System.out.println(age +" "+ breed + " is eating\n\n");    
    }
}

public class ClassObject {
    public static void main(String[] args) {
        StudentDetails obj1 = new StudentDetails();
        obj1.name = "John";
        obj1.age = 20;
        obj1.Display();
        StudentDetails obj2 = new StudentDetails();
        obj2.name = "Alice";
        obj2.age = 22;
        obj2.Display();
        StudentDetails obj3 = new StudentDetails();
        obj3.name = "Rara";
        obj3.age = 99;
        obj3.Display();

        Dog d1 = new Dog();
        d1.name = "Buddy";
        d1.breed = "Golden Retriever";
        d1.color = "Golden";
        d1.age = 3;
        d1.bark();
        d1.eat();

    }
    
}