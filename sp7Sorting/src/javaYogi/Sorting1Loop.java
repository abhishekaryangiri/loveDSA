/*
 Ways of sorting in Java

Using loops
Using sort() method of Arrays class
Using sort method of Collections class
Sorting on a subarray
 */
package javaYogi;

public class Sorting1Loop {
public static void main(String[] args) {
	//sorting using loop
	  // Custom input array
    int arr[] = { 4, 3, 2, 1 };

    // Outer loop
    for (int i = 0; i < arr.length; i++) {

        // Inner nested loop pointing 1 index ahead
        for (int j = i + 1; j < arr.length; j++) {

            // Checking elements
            int temp = 0;
            if (arr[j] < arr[i]) {

                // Swapping
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Printing sorted array elements
        System.out.print(arr[i] + " ");
    }
}
}
