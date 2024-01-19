package TwoDArrays;

import java.util.Arrays;

public class TwoDArray_20 {
    //20
    /*
[1, 2, 3, 4, 5, 0, 0, 0, 0]
[0, 2, 3, 4, 5, 0, 0, 0, 0]
[0, 0, 3, 4, 5, 0, 0, 0, 0]
[0, 0, 0, 4, 5, 0, 0, 0, 0]
[0, 0, 0, 0, 5, 0, 0, 0, 0]
[0, 0, 0, 0, 5, 4, 0, 0, 0]
[0, 0, 0, 0, 5, 4, 3, 0, 0]
[0, 0, 0, 0, 5, 4, 3, 2, 0]
[0, 0, 0, 0, 5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        int size = 5;
        int rows = size*2-1;
        int cols = rows;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < size; j++) {
                arr[i][j] = j+1;
            }
            if (i>=size){
                for (int j = size-1; j < i+1; j++) {
                    arr[i][j] = cols-j;
                }
            }
        }

        for (int[] unit: arr){
            System.out.println(Arrays.toString(unit));
        }

    }
}
