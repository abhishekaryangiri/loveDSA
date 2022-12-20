/*
 1. Nav­i­gate through the array. 
2. Check if a[i] = -1, if yes then ignore it. 
3. If a[i] != -1, Check if element a[i] is at its cor­rect posi­tion (i=A[i]). If yes then ignore it. 
4. If a[i] != -1 and ele­ment a[i] is not at its cor­rect posi­tion (i!=A[i]) then place it to its correct posi­tion, but there are two conditions:  

Either A[i] is vacate, means A[i] = -1, then just put A[i] = i .
OR A[i] is not vacate, means A[i] = x, then int y=x put A[i] = i. Now, we need to place y to its cor­rect place, so repeat from step 3.
Below is the implementation for the above approach: 

Time Complexity: O(n)
Auxiliary Space: O(1)
 */
package loveDSA;

import java.util.*;
import java.lang.*;

public class RearrangeArr2 {
	// Function to rearrange an array
    // such that arr[i] = i.
    public static int[] fix(int[] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != -1 && A[i] != i)
            {
                int x = A[i];
 
                // check if desired place
                // is not vacate
                while (A[x] != -1 && A[x] != x)
                {
                    // store the value from
                    // desired place
                    int y = A[x];
 
                    // place the x to its correct
                    // position
                    A[x] = x;
 
                    // now y will become x, now
                    // search the place for x
                    x = y;
                }
 
                // place the x to its correct
                // position
                A[x] = x;
 
                // check if while loop hasn't
                // set the correct value at A[i]
                if (A[i] != i)
                {
                    // if not then put -1 at
                    // the vacated place
                    A[i] = -1;
                }
            }
        }
        return A;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int A[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        System.out.println(Arrays.toString(fix(A)));
    }
}
