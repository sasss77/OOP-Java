import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListCC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // lists.add("hello");
        // lists.add("world");
        // System.out.println(lists.get(0));
        // System.out.println(lists.get(1));
        // lists.set (0, "world");
        // lists.set (1, "Hello");
        // System.out.println(lists.get(1));
        // System.out.println(lists.get(0));
        // lists.remove(1);
        // System.out.println(lists.get(0));   
        
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            list.add(in.next());
        }
        //Printing Array Elements
        System.out.println("ArrayList Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
    
}
