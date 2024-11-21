public class TaskForLoop {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 5; col++) {
                // Top row, middle row, bottom row
                if ((row == 0 || row == 3 || row == 6) && col < 4) {
                    System.out.print("*");
                }
                // Left column of top half
                else if (row < 3 && col == 0) {
                    System.out.print("*");
                }
                // Right column of bottom half
                else if (row > 3 && col == 4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
