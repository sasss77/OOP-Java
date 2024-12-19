import java.util.*;

public class Taask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] ary = new int[3][3];
        for (int i = 0; i < ary.length; i++)
        {
            for (int j = 0; j < ary[i].length; j++) {
                System.out.print("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
                ary[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < ary.length; i++)
        {
            for (int j = 0; j < ary[i].length; j++) {
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
    }
}   