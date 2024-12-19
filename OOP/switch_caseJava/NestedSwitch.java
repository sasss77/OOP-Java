

public class NestedSwitch {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        
        switch (x) {
            case 5:
                switch (y) {
                    case 10:
                        System.out.println("x is 5 and y is 10");
                        break;
                    default:
                        System.out.println("x is 5 but y is not 10");
                }
                break;
            default:
                System.out.println("x is not 5");
        }
    }
    
}
