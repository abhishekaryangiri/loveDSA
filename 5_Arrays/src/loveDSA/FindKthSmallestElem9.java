/*
 given an arr[] and an int k where k is smaller than size of arr, the task is to find the kth smallest elem in given arr it is givven that all elem are distinct
 Input : 
 N = 6
 arr[] = 7 10 4 3 20 15
 k =3
 
 Output:
 7
 */
package loveDSA;

import java.util.Scanner;

public class FindKthSmallestElem9 {
public static void main(String[] args) {
	Scanner dada = new Scanner(System.in);
	System.out.println("Enter length of array");
	int num = dada.nextInt();
	int[] arr = new int[num];
	for ( int i = 0; i < num; i++)
	{
		arr[i] = dada.nextInt();
	}
	int kaka = dada.nextInt();
	Arrays.sort(arr);
	System.out.println(arr[kaka-1]);
}
}
