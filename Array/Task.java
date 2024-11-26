// package Array;


public class Task {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ram";
        names[1] = "Shyam";
        names[2] = "Ghanashyam";
        //printing names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        //updating names
        names[0] = "Sitaram";
        names[2] = "Rita";
        //printing updated names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
