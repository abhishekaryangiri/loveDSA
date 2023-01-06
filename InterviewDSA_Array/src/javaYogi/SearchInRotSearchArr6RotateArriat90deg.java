package javaYogi;

import java.util.Arrays;

public class SearchInRotSearchArr6RotateArriat90deg {
	public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        System.out.println("Original array:");
        printArray(arr);
        arr = rotateArray(arr);
        System.out.println("Rotated array:");
        printArray(arr);
    }

    public static int[][] rotateArray(int[][] arr) {
        int n = arr.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - i - 1] = arr[i][j];
            }
        }
        return result;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
