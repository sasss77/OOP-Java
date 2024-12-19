public class DimensionArray {
    public static void main(String[] args)
    {
        //One dimensional array
        int[] dim1 = { 1, 2, 3, 4, 5, 6 };
        
        // Two Dimensional Array
        int[][] dim2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        // Three Dimensional Array
        int[][][] dim3 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };

        //Printing one dimension array
        System.out.println("One Dimensional Array");
        for (int i = 0; i < dim1.length; i++) {
            System.out.print(dim1[i] + " ");
        }

        //Printing two dimensions array
        System.out.println("\n\nTwo Dimensional Array");
        for (int i = 0; i < dim2.length; i++) {
            for (int j = 0; j < dim2[i].length; j++) {
                System.out.print(dim2[i][j] + " ");
            }
            System.out.println();
        }

        //Printing three dimensions array
        System.out.println("\n\nThree Dimensional Array");
        for (int i = 0; i < dim3.length; i++) {
            for (int j = 0; j < dim3[i].length; j++) {
                for (int k = 0; k < dim3[i][j].length; k++) {
                    System.out.print(dim3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
