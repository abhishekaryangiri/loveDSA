package javaYogi;

import java.util.Arrays;

public class Sorting1UsingArraySort {
//2 Arrays.Sort() : works for arrays which can 
//	be of primitive data type also which in turn by default sorts in ascending order.
	public static void main(String[] args) {
		// Custom input array
        int[] nums = { 13, 7, 6, 45, 21, 9, 101, 102 };
 
        // Calling the sort() method present
        // inside Arrays class
        Arrays.sort(nums);
 
        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s",  Arrays.toString(nums));
	}
}
