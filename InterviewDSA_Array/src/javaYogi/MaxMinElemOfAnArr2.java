package javaYogi;

import java.util.Arrays;

public class MaxMinElemOfAnArr2 {
//using Arrays.sort() method
	public static void main(String[] args) {
		int[] array = {10, 2, 3, 4, 510, 20};
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length - 1];
		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}
}
