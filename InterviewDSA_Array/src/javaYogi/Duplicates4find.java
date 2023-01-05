package javaYogi;

public class Duplicates4find {
public static void main(String[] args) {
	int numArr[] = { 0, 4, 3, 2, 7, 8, 1, 2, 3, 1 };
	 
    for (int i = 0; i < numArr.length; i++) {
    	numArr[numArr[i] % numArr.length]
            = numArr[numArr[i] % numArr.length]
              + numArr.length;
    }
    System.out.println("The repeating elements are : ");
    for (int i = 0; i < numArr.length; i++) {
        if (numArr[i] >= numArr.length * 2) {
            System.out.print(i + " ");
        }
    }
}
}
