package javaYogi;

import java.util.Arrays;

public class MaxMinElemOfAnArr3 {
//Using the Stream API:
	public static void main(String[] args) {
		int[] array = {101, 2, 3, 4, 510, 20};
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}
}
