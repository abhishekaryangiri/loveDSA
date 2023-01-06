package javaYogi;

import java.util.Arrays;

public class SearchInRotSearchArr6RotateArrinClockwise {
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int k = 2;

	        System.out.println("Original array: " + Arrays.toString(arr));
	        arr = rotateArray(arr, k);
	        System.out.println("Rotated array: " + Arrays.toString(arr));
	    }

	    public static int[] rotateArray(int[] arr, int k) {
	        int n = arr.length;
	        int[] result = new int[n];
	        for (int i = 0; i < n; i++) {
	            result[(i + k) % n] = arr[i];
	        }
	        return result;
	    }
}
