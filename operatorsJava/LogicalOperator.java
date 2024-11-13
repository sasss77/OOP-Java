
public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // Logical AND operator
        System.out.println("a AND b: " + (a > 0 && b > 0));
        
        // Logical OR operator
        System.out.println("a OR b: " + (a > 0 || b > 0));
        
        // Logical NOT operator
        boolean g = !(a > 0);
        System.out.println("NOT a: " + g);
    }
    
}
