package javaYogi;

import java.util.Arrays;

public class MaxSubarray4 {
public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5};
	int[] subarray = Arrays.copyOfRange(array, 2, 4);
	System.out.println(Arrays.toString(subarray)); // prints [3, 4]
}
}
