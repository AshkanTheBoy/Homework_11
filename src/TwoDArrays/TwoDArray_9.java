package TwoDArrays;

import java.util.Arrays;

//9
/*
[5, 4, 3, 2, 1]
[4, 3, 2, 1, 0]
[3, 2, 1, 0, 0]
[2, 1, 0, 0, 0]
[1, 0, 0, 0, 0]
 */
public class TwoDArray_9 {
    public static void main(String[] args) {
        int size = 5;
        int rows = size;
        int cols = rows;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols-i; j++) {
                arr[i][j] = size-(j+i);
            }
        }

        for (int[] unit: arr){
            System.out.println(Arrays.toString(unit));
        }
    }
}
