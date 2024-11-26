public class Arr2 {
    public static void main(String[] args) {
        int[] arr1;
        //allocate size
        arr1 = new int[5];
        
        // initialize array elements
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        
        // print array elements
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //2. declare and define array and elements at the same time
        int[] arr2 = { 10, 20, 30, 40, 50 };

        //changing elements of arr2
        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        arr2[3] = 400;
        arr2[4] = 500;
        
        // print array elements
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
    
            }
    }
    
}

