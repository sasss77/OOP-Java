import java.util.Scanner;

public class ParsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        System.out.println("Parsed number: " + Integer.parseInt(number));

    }

}
