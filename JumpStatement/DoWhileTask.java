import java.util.Scanner;
public class DoWhileTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int a = in.nextInt();
        do 
        {
            int sum = 0;
            for (int i = 1 ; i<=a ; i++)
            {
                sum += i;
            }
            System.out.println("The addition of up to number" + a + " is " + sum );
            System.out.println("Do you want to continue? Type yes to continue and type anything to stop.");
            String choice = in.next();
            if (choice.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter a positive integer: ");
                a = in.nextInt();
            }
            else
            {
                break;
            }
            
        } while (true);
    }
}
