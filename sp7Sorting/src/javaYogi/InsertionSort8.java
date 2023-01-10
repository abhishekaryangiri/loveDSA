package javaYogi;

import java.util.Arrays;

public class InsertionSort8 {
	//insertion sort
	 void InsertionSort(int[] nums){
		  for(int i = 1; i < nums.length; i++){
		    int value = nums[i];
		    int j = i - 1;
		    while(j >= 0 && nums[j] > value){
		      nums[j + 1] = nums[j];
		      j = j - 1;
		    }
		    nums[j + 1] = value;
		  }
		}
		    
			// Method to test above
		    public static void main(String args[])
		    {
		    	InsertionSort8 ob = new InsertionSort8();
		        int nums[] = {10, -20, 30, 540, 880, -40, 440};
		        System.out.println("Original Array:");
		        System.out.println(Arrays.toString(nums));
		        ob.InsertionSort(nums);
		        System.out.println("Sorted Array");
		        System.out.println(Arrays.toString(nums));
		    }
}
