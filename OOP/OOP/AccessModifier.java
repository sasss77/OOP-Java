class Example {
    String name;
    private String email;
    public int age;
    protected String lastname;
    
    private void setEmailData(String e) {
        email = e;
    }
    void dislayInfo() {
        System.out.println(name + " " + age);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Example o = new Example();
        o.name = "Saugat";
        o.age = 10;
        o.lastname = "Paneru";
        // o.email = "saugatpaneru@gmail.com"; //error cause of private modifier
        o.dislayInfo();
        // o.setEmailData("ram@gmail.com"); //error cause of private modifier

    }
}