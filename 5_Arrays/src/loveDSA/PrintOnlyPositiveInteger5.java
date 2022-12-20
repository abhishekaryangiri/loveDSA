/*
 Given an array of int {2, 6, -5, -1, 0, 4, -9} , print only the positive values in the arr.
 output:
 2
 6
 0
 4
 */
package loveDSA;

public class PrintOnlyPositiveInteger5 {
public static void main(String[] args) {
	int arr[] = {2, 6, -5, -1, 0, 4, -9};
	for(int dada : arr)
	{
		if(dada >=0)
		{
			System.out.println(dada);
		}
	}
}
}
