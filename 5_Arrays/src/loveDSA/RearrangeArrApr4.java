
/*
Another Approach (Swap elements in Array) : Using cyclic sort
1) Iterate through elements in an array 
2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])

Below is the implementation of the above approach. 
 */
package loveDSA;

public class RearrangeArrApr4 {
	 public static void main(String[] args)
	    {
	        int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
	        for (int i = 0; i < arr.length;)
	        {
	            if (arr[i] >= 0 && arr[i] != i)
	            {
	                int ele = arr[arr[i]];
	                arr[arr[i]] = arr[i];
	                arr[i] = ele;
	            }
	            else
	            {
	                i++;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	    }
}
