package javaYogi;

import java.util.Scanner;

public class CheckFactorial4 {
//check factorial
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // Read the number from the user
	    System.out.print("Enter a number: ");
	    int number = scanner.nextInt();

	    // Calculate and print the factorial
	    int result = factorial(number);
	    System.out.println(number + "! = " + result);
	  }

	  public static int factorial(int n) {
	    if (n == 0) {
	      return 1;
	    } else {
	      return n * factorial(n - 1);
	    }
	  }
}
