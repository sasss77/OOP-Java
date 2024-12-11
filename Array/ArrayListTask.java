import java.util.*;

public class ArrayListTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<String> ch = new ArrayList<>();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("Element %d %d", i, j);
                numbers.add(new ArrayList<>(Arrays.asList(i + 1, j + 1)));
            }
            // Printing values
            for (int p = 0; p < numbers.size(); p++) {
                for (int j = 0; j < numbers.get(i).size(); j++) {
                    System.out.printf("Element %d %d", i, j);
                }

            }
        }
    }
}