package javaYogi;

public class Duplicates5NestrdLoop {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5,1,2,7,8,10};
	System.out.println("Original array:  ");
	System.out.println("{1,2,3,4,5,1,2,7,8,10}  ");
  	System.out.println(" Duplicates are: ");
    for (int i = 0; i < a.length - 1; i++) {
        for (int j = i + 1; j < a.length; j++)
        {
            if ((a[i] == a[j]) && (i != j)) {

                System.out.print( a[j] + " ");
         }
    }
}
}
}
