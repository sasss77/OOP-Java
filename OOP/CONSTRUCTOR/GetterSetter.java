
class peopleExample {
    private String name;
    private int age;
    private boolean employee;

    //1.getter (read only private property) and has same written type as variable 
    //It doesn't have arguement
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getEmployee() {
        return this.employee;
    }

    //setter- (write only private property)
    //get has void return typpe, doesnot return anything
    //setter takes arguement as same as the variable/parameter
    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        peopleExample p1 = new peopleExample();
        p1.setName("Saugat");
        System.out.println(p1.getName());
        p1.setAge(19);
        System.out.println(p1.getAge());
        p1.setEmployee(false);
        System.out.println(p1.getEmployee());

    }
}
