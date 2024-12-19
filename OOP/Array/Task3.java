



public class Task3 {
    public static void main(String[] args) {
        int[] arg = { 22, 33, 44, 55, 66, 77, 101, 202, 403, 899 };
        System.out.println("Even numbers are :");
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] % 2 == 0) {
                System.out.print(arg[i] + " ");
            }
        }
        System.out.println("\n\n_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n\n");
        int[] values = { 4, 6, 2, 10, 699, 80, 1, 50};
        int max = 1;
        int min = 0;
        System.out.println("Values: ");
        //finding min and max value in the array named values
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + "  ");
            if (max < values[i]) 
            {
                max = values[i];
            }
            }
            System.out.println("\n\nMax value is " + max);
        for (int j = 0; j < values.length; j++) {
            if (max > values[j]) {
                max = values[j];
                min = values[j];
            }
            }
            System.out.println("Min value is " + min);
            
        }
    }
 