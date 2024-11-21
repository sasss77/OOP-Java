public class Task {
    public static void main(String[] args) {
        //square of  the following
        System.out.println("Number  square");
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println(i + "      " + square);
        }

        //print  rectangle using star
        System.out.println("\n\nPrinting Rectangle...");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
