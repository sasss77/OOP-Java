public class test {
    public static void main(String[] args) {
        //The parameter String[] srgs takes array of input 
        //when running from command Line
        //you can compile java file with 
        //javac filename.java
        //java filename args1 args2
        //or 
        //java filename.java args1 args2
        System.out.println("First args " + args[0]);
        System.out.println("Second args " + args[1]);

        //The args arge in datatype String to convert or parse any args 
        int argsParse1 = Integer.parseInt(args[0]); 
        int argsParse2 = Integer.parseInt(args[1]);
        System.out.println("Sum of args: " + (argsParse1 + argsParse2));
    }
    
}
