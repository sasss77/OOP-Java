import java.util.Scanner;

class Calculation {
    private double a, b;
    protected double result;

    Calculation(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

class Addition extends Calculation {
    Addition(double a, double b) {
        super(a, b);
    }

}



public class OOPJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = in.nextDouble();
        System.out.println("Enter second number: ");
        double b = in.nextDouble();
        Calculation calc = new Calculation(a, b);
        System.out.println("The addition of two numbers are : " + (calc.a + calc.b));

    }
}
