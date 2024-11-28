import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("The numbers are :");
        int j = 0;
        while (j < numbers.size())
        {
            System.out.println(numbers.get(j));
            j++;
        }}
    }

