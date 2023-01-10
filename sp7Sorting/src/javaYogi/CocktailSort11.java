package javaYogi;

import java.util.Arrays;

public class CocktailSort11 {
	 void cocktailSort(int nums[])
	    {
		  boolean swapped;
		  do {
			swapped = false;
			for (int i =0; i<=  nums.length  - 2;i++) {
				if (nums[ i ] > nums[ i + 1 ]) {
					//test if two elements are in the wrong order
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1]=temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
			swapped = false;
			for (int i= nums.length - 2;i>=0;i--) {
				if (nums[ i ] > nums[ i + 1 ]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1]=temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
	    // Method to test above
	    public static void main(String args[])
	    {
	    	CocktailSort11 ob = new CocktailSort11();
	        int nums[] = {10,20,60,200,-120,600};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.cocktailSort(nums);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
