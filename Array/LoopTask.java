public class LoopTask {
    public static void main(String[] args) {
        String[][] data = new String[2][3];
        data[0][0] = "John";
        data[0][1] = "Doe";
        data[0][2] = "ken";
        data[1][0] = "Ram";
        data[1][1] = "Shyam";
        data[1][2] = "Hari";
        
        //Printing results
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        //Printing results
        for (String[] a : data) {
        for (String b : a)
        {
            System.out.print(b + " ");
        }
        System.out.println();
        }
    }
}
