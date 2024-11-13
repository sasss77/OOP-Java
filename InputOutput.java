import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //all input types in java
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.println("You entered: " + a);
        
        System.out.print("Enter a float number: ");
        float b = in.nextFloat();
        System.out.println("You entered: " + b);
        in.nextLine();
        
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println("You entered: " + str);

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = in.nextBoolean();
        System.out.println("You entered: " + bool);
        
        System.out.print("Enter a character: ");
        char c = in.next().charAt(0);
        System.out.println("You entered: " + c);
        System.err.printf("%s \n", str);
    
        
        System.out.print("Enter a double number: ");
        double dbl = in.nextDouble();
        System.out.println("You entered: " + dbl);
        
        in.close();
        


        




        
        
    }


}
