package javaYogi;

import java.util.Arrays;

public class SelectionSort7 {
//selection sort
	public static void sort(int[] nums)
	  {
	  for(int currentPlace = 0;currentPlace<nums.length-1;currentPlace++){
	  int smallest =  Integer.MAX_VALUE;
	  int smallestAt =  currentPlace+1;
	  for(int check =  currentPlace; check<nums.length;check++){
	  if(nums[check]<smallest){
	  smallestAt  = check;
	  smallest  = nums[check];
	  }
	  }
	  int temp =  nums[currentPlace];
	  nums[currentPlace]  = nums[smallestAt];
	  nums[smallestAt]  = temp;
	  }
	  }
	  // Method to test above
	  public static void main(String args[])
	  {
		  SelectionSort7 ob = new SelectionSort7();
	  int nums[] = {7, -5, 3, 2, 1, 0, 150};
	  System.out.println("Original  Array:");
	  System.out.println(Arrays.toString(nums));
	  ob.sort(nums);
	  System.out.println("Sorted  Array:");
	  System.out.println(Arrays.toString(nums));
	  }        
}
