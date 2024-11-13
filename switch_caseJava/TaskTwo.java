public class TaskTwo {
    public static void main(String[] args) {
        String locale = "np";
        switch (locale) {
            case "en":
            case "en/US":
            case "en/UK":
                System.out.println("Selected English");
                break;
            case "in":
                System.out.println("Selected Indian");
                break;
            case "jp":
                System.out.println("Selected Japan");
                break;
            case "np":
                System.out.println("Selected Nepal");
                break;
            default:
                System.out.println("Unknown locale");

        
        }
    }
}
