
public class PrefixNPostfix {
    public static void main(String[] args) {
        int  a = 10;
        
        // Prefix increment operator
        System.out.println("Before increment: " + a);
        System.out.println("After increment: " + ++a);
        
        // Prefix decrement operator
        System.out.println("Before decrement: " + a);
        System.out.println("After decrement: " + --a);
        
        // Postfix increment operator
        System.out.println("Before increment: " + a);
        System.out.println("After increment: " + a++);
        
        // Postfix decrement operator
        System.out.println("Before decrement: " + a);
        System.out.println("After decrement: " + a--);
    }
    
}
