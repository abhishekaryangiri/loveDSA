package javaYogi;

import java.util.Arrays;

public class QuickSort3 {
//Write a Java program to sort an array of given integers using Quick sort Algorithm.
//Quick sort is a comparison sort, meaning that it can sort items of any type for which a "less-than" relation (formally, a total order) is defined.
	 private int temp_array[];
	    private int len;
	 
	    public void sort(int[] nums) {
	         
	        if (nums == null || nums.length == 0) {
	            return;
	        }
	        this.temp_array = nums;
	        len = nums.length;
	        quickSort(0, len - 1);
	    }
	     private void quickSort(int low_index, int high_index) {
	         
	        int i = low_index;
	        int j = high_index;
	        // calculate pivot number 
	        int pivot = temp_array[low_index+(high_index-low_index)/2];
	        // Divide into two arrays
	        while (i <= j) {
	               while (temp_array[i] < pivot) {
	                i++;
	            }
	            while (temp_array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (low_index < j)
	            quickSort(low_index, j);
	        if (i < high_index)
	            quickSort(i, high_index);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = temp_array[i];
	        temp_array[i] = temp_array[j];
	        temp_array[j] = temp;
	    }
	     
	     // Method to test above
	    public static void main(String args[])
	    {
	    	QuickSort3 ob = new QuickSort3();
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        ob.sort(nums);
	        System.out.println("Sorted Array");
	        System.out.println(Arrays.toString(nums));
	    }
}
