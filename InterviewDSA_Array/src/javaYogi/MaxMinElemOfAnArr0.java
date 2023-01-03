package javaYogi;

public class MaxMinElemOfAnArr0 {
//Maximum and Minimum Element in an Array
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 510, 20};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
		    if (array[i] > max) {
		        max = array[i];
		    }
		    if (array[i] < min) {
		        min = array[i];
		    }
		}
		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}
}
