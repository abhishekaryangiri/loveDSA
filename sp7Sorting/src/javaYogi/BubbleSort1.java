package javaYogi;

import java.util.Arrays;

public class BubbleSort1 {
	   void bubbleSort(int nums[])
	    {
	        int n = nums.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (nums[j] > nums[j+1])
	                {
	                    // swap temp and nums[i]
	                    int temp = nums[j];
	                    nums[j] = nums[j+1];
	                    nums[j+1] = temp;
	                }
	    }
	 
	    // Method to test above
	    public static void main(String args[])
	    {
	    	BubbleSort1 ob = new BubbleSort1();
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.bubbleSort(nums);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
