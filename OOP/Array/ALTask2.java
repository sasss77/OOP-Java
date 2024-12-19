import java.util.ArrayList;
public class ALTask2 {
    public static void main(String[] args) {
        ArrayList<Character> grades = new ArrayList<>();
        grades.add('A');
        grades.add('B');
        grades.add('z');
        grades.add('c');
        grades.add('D');
        grades.add('E');
        grades.add('G');
        // grades.set(2, 'Z');
        grades.set(3, 'C');
        System.out.println(grades.get(0));
        System.out.println(grades.get(grades.size() - 1));
        grades.set(grades.size() - 1, 'F');
        grades.remove(2);
        // for (int i = 0; i < grades.size(); i++) {
        //     if (grades.get(i).equals('Z'))
        //     {
        //         System.out.println("The index of the element Z is: " + i);
        //     }
        // }
        System.out.println("The indez of the element z is :" + grades.indexOf('z'));
    }
}
