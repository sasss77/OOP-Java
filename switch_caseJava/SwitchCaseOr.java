public class SwitchCaseOr {
    public static void main(String[] args) {
        int a = 400;
        // int b = 100;
        switch (a) {
            case 100:
            case 200:
                System.out.println("a is 200");
                break;
            case 300:
            case 400:
            case 404:
                System.out.println("a is 400");
                break;
            default:
                System.out.println("a is not in the given range");

        }
    }
}
