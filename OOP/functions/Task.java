public class Task {
    public static void studentDetails(String name, int age, String gender, char result){

        //this function will print name age and gender
        System.out.println("Name:"+name+"\nage:"+age+"\ngender:"+gender+"\nresult:"+result);
    }
    public static void main(String[] args) {
        String name = "Saugat";
        int age = 90;
        String gender = "Male";
        char result = 'A';
        studentDetails(name, age, gender, result);
        
        
    }
}
