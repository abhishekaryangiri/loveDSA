package javaYogi;

import java.util.Arrays;

public class ReverseTheArray4collection {
public static void main(String[] args) {
	int[] oldArr = {1, 2, 3, 4, 5};
  System.out.println("Original array : "+Arrays.toString(oldArr));  
   for(int i = 0; i < oldArr.length / 2; i++)
  {
    int temp = oldArr[i];
    oldArr[i] = oldArr[oldArr.length - i - 1];
    oldArr[oldArr.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(oldArr));

}
}
