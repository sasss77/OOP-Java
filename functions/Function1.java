// package functions;

public class Function1 {
    public static int add(int a, int b)
    {
        //1. Modifier -> public, private, protected
        //2. static -> without obj
        //3.returnType ->what func returns 
        //4.functionName -> name of the function
        //arguements/parameters -> the values/variables that are passed to the function
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 10 and 20 is " + add(10, 20));
    }
}
