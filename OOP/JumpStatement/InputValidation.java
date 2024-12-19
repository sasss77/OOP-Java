import java.util.*;
public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass = "1,2,3,4asdf";
        String userPass = in.nextLine();
        while (!userPass.equals(pass))
        {
            System.out.println("Incorrect password. Please try again.");
            userPass = in.nextLine();
        }
        System.out.println("Password accepted.");

        // for int 
        System.out.println("Enter positive num:");
        int num = in.nextInt();
        while (num < 0)
        {
            System.out.println("Incorrect positive integer! ");
            num = in.nextInt();
        }
        System.out.println("correct!! positive integer");
        in.close();
    }
}
