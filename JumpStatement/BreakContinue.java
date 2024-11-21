
//Break & Continue
public class BreakContinue {
    public static void main(String[] args) 
    {
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking loop at i = 5");
                break;
            }
            
            if (i % 2 == 0) {
                System.out.println("Skipping odd number: " + i);
                continue;
            }
            
            System.out.println();
        }
    }
}
