import java.util.*;
public class CheckUserPass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "saugat";
        int pin = 1234;
        System.out.println("Enter your username: ");
        String user = in.nextLine();
        while (!user.equals(username))
        {
            System.out.println("Invalid username. Please try again.");
            user = in.nextLine();
        }
        System.out.println("Enter your PIN: ");
        int userPin = in.nextInt();
        int i = 5;
        while (i > 1)
        {
            if (userPin != pin)
            {
                System.out.printf("Invalid PIN. you have %d tries left:  ", i-1);
                userPin = in.nextInt();
                i--;
            }
            else {
                System.out.println("You are gay!");
                break;
            }
            in.close();
        }
    }
}
