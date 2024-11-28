public class testttttt {
    public static void main(String[] args) {
        int[][] values = new int[2][2];
        values[0][0] = 10;
        values[1][1] = 20;
        // values[2] = 30;
        for (int[] a : values) {
        for (int b : a)
        {
                System.out.println(b);
        }
    }
    }
}
