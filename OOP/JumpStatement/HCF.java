import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers: ");
        int n = in.nextInt();
        int m = in.nextInt();
        
        int hcf = 1;
        int limit = Math.min(n, m); 
        
        
        for (int i = 1; i <= limit; i++) {
           
            if (n % i == 0 && m % i == 0) {
                hcf = i; 
            }
        }
        
        // Output the result
        System.out.println("HCF is: " + hcf);
    }
}
