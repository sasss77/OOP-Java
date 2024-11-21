public class ForLoop {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println((10 - i) + " heheheheheheeeeeee");
            //nested for loop example
            for (int j = 0; j < 5; j++) {
                System.out.println("Inside nested loop: " + j);
            }
            System.out.println("End of nested loop");

        }
        //printing 'S' using * and nested for loop
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
            }

        }
        
    }

