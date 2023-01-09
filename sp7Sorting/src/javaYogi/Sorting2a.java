package javaYogi;

import java.util.Arrays;

public class Sorting2a {
public static void main(String[] args) {
	 //define an array
    int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7}; 

    System.out.printf("Original Array : %s", Arrays.toString(intArray)); 

    Arrays.sort(intArray); 

    System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray));
}
}
