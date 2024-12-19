public class ClassWork {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.printf("%d * %d = %d\n", 5, num, (5 * num));
            num++;

        } while (num <= 10);

        System.out.println("\n\n\n");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else
                continue;
        }

    }
}