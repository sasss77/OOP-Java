public class variables {
    // instance variable
    int num = 500;
    // Instance variable can only be acccessed inside the class outside the main
    // function
    // It can only be accessed by using its object

    // static variable
    static boolean yesNo = false;
    // Static variable can be accessed directly by using its class name

    // creating function
    void firstFunc() {
        int localVar = 30;
        // Local variable can only be accessed inside the function/constructor
        // scope/block
        System.out.println("Local variable in firstFunc: " + localVar);
    }

    public static void main(String[] args) {
        int localVar2 = 40;
        System.out.println("local variable : " + localVar2);
        // to use instance variable of class, make object
        // Syntax: ClassName obj = new ClasName();
        variables instanceObj = new variables();
        // The variable of variables is called object, here instanceObj
        System.out.println("Instance Variable: " + instanceObj.num);
        // to use static variable of class, directly use class name
        System.out.println("Static Variable: " + variables.yesNo);
        instanceObj.firstFunc(); // calling function of class using object
        variables obj2 = new variables();
        System.out.println(" Instance Variable with another object : " + obj2.num);
        System.out.println("Statc variable with calss object: " + obj2.yesNo);

        obj2.num = 300000;
        System.out.println(obj2.num);

        variables.yesNo = true;
        System.out.println(variables.yesNo);
    }
}
