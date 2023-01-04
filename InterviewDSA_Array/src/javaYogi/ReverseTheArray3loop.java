package javaYogi;

public class ReverseTheArray3loop {
public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	System.out.println("Original Array is:     ");
	System.out.println("1, 2, 3, 4, 5");
	System.out.println("Reversed Array is:  ");
	
	int n = arr.length-1;
	for (int i = n; i >=0; i--) {
//	    int temp = array[i];
//	    array[i] = array[n - i - 1];
//	    array[n - i - 1] = temp;

		 System.out.print( arr[i]+ ", ");
	}

}
}
