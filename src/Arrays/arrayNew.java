package Arrays;

public class arrayNew {
    public static void main(String[] arg) {

        // int array
        int[] myFirstArray = new int[5];
        myFirstArray[2] = 2;

        //String array
        String[] myStringArray = {"A", "B", "C", "D"};
        //System.out.println(myFirstArray[2]);
        //System.out.println(myStringArray[3]);

        //Array length
        int[] intArray = new int[5];
        //System.out.println(intArray.length);

        //How to count sum of array
        int[] testArray = {12, 44, 54, 82};
        int sum = 0;

        for (int x = 0; x < testArray.length; x++) {
            sum = sum + testArray[x];
            //System.out.println(x + " elements sum is " + sum);
        }
        //System.out.println("The final sum is " + sum);

        //Enhanced for loop
        int[] digits = {1, 2, 3, 4, 6};

        for (int t : digits) {
            //System.out.println(t);
        }

        //Multidimensional Array
        int[][] myMultiArray = {{1, 2, 3}, {4, 5, 6}};
        //System.out.println(myMultiArray[1][1]);

        //How to visualise the array
        for (int y = 0; y <= 1; y++) {

            for (int x = 0; x <= 2; x++) {
                System.out.print(myMultiArray[y][x] + "\t");
            }
            System.out.println();
        }

    }
}
