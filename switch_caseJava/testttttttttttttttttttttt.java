import java.util.*;

public class testttttttttttttttttttttt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input characters(+, -, *, /): ");
        char c = in.next().charAt(0);
        // System.out.println(c);
        System.out.println("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
            
            switch (c) {

                case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
                case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
                case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
                case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            
            default:
                System.out.println("Invalid choice :/");
                break;
        }
    
        in.close();
    }
}
