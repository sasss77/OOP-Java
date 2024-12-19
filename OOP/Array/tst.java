// import java.util.Scanner;
// public class tst {
//     public static int add(int a, int b) {
//         return (a + b);
//     }

//     public static int subtract(int a, int b) {
//         return (a - b);
//     }

//     public static int multiply(int a, int b) {
//         return (a * b);
//     }

//     public static int divide(int a, int b) {
//         if (b == 0) {
//             System.out.println("Error");
//             return -1;
//         }
//         else {

//             return (a / b);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a = in.nextInt();
//         System.out.println("Enter the second number: ");
//         int b = in.nextInt();
//         System.out.println("\n\n" + add(a, b));
//         System.out.println(subtract(a, b));
//         System.out.println(multiply(a, b));
//         System.out.println(divide(a, b));

//     }
// }










// import java.util.ArrayList;

// public class tst {
//     public static void main(String[] args) {

//         ArrayList<Integer> nums = new ArrayList<>();
//         nums.add(1);
//         nums.add(10);
//         nums.add(200);
//         nums.add(30);
//         nums.add(9);
//         nums.add(90);
        // int max = 0;
        // int min = 0;

        // //printing the maximum numbers among the numbers
        // for (int i = 0; i < nums.size(); i++) {
        //     if (nums.get(i) > max) {
        //         max = nums.get(i);
        //     }
        // }
        // System.out.println("The max value is " + max);

        // for (int i = 0; i < nums.size(); i++) {
        //     if (nums.get(i) < max) {
        //         max = nums.get(i);
        //         min = nums.get(i);
        //     }
        // }
        // System.out.println("The min value is " + min);

//     }

// }


import java.util.Scanner;

public class tst {

        public static void main(String[] args) {
                String[] names = { "Saugat", "Ram", "Shyam", "Hari" };
                Scanner in = new Scanner(System.in);
                
                System.out.println("Enter a name: ");
                String name = in.nextLine();
                
                for (String yes : names) {
                        if (name.equals(yes)) {
                                System.out.println("Welcome " + yes);
                        }
                }

                
                in.close();
        }
}