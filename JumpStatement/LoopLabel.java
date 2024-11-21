public class LoopLabel {
    public static void main(String[] args) {
        for (int idx = 0; idx <= 5; idx++) {
            System.out.println("For loop " + idx);
        }
        int num = 10;
        while (true) {
            if (num % 3 == 0) {
                break;
            }
            System.out.println("While loop " + num);
            num++;
        }
        //loop label
        label: for (int fst = 0; fst <= 2; fst++) {
            System.out.println("Outer loop : " + fst);
            for (int snd = 0; snd <= 5; snd++) {
                System.out.println("Inner loop : " + snd);
                if (snd == 2) {
                    break label;
                }

            }
        }
    }
}
