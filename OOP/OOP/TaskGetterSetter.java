
class Teacher {
    private String firstName, lastName;
    private int age;
    private boolean fullTime;

    Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getFullTime() {
        return this.fullTime;
    }

    void print() {
        System.out.println("name: " + this.firstName + " " + this.lastName);
    }
}

public class TaskGetterSetter {
    public static void main(String[] args) {
        Teacher o1 = new Teacher("Saugat", "Paneru");
        Teacher o2 = new Teacher("Ram", "Chandra");
        o2.setAge(19);
        o2.setFullTime(false);
        o2.print();
        System.out.println("age: " + o2.getAge());
        System.out.println("Full time: " + o2.getFullTime());

        // String formatter in java
        String name = String.format("%s %s", o1.getFirstName(), o1.getLastName());
        System.out.println(name);
    }
}
