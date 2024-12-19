
import java.util.Scanner;

public class switch_case1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Choices : \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n\nEnter your choice: ");
        int ch = in.nextInt();
        System.out.println("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        switch (ch) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
                case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
                case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
                case 4:
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Invalid choice :/");
                break;

        }
        in.close();
    }
}
