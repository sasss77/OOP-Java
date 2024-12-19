import java.util.*;

public class TAsk2 {
    static void square(double a) {
        // This fuction is called whenever user needs to find out square of numbers
        System.out.println("Square of the number is: " + (a * a));
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter a number to find its square: ");
        double num = i.nextDouble();
        square(num);
    }
}
