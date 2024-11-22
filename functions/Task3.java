public class Task3 {
    public static void SQRT(int a) {
        for (int i = 1; i < 10; i++) {
            double sqrt = Math.sqrt(i);
            System.out.println("The square root of " + i + " is: " + sqrt);
        }
    }
    public static void main(String[] args) {
        SQRT(10);

    }

}
