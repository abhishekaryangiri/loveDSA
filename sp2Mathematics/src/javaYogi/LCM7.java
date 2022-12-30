package javaYogi;

import java.util.Scanner;

public class LCM7 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // Read the numbers from the user
	    System.out.print("Enter the first number: ");
	    int number1 = scanner.nextInt();
	    System.out.print("Enter the second number: ");
	    int number2 = scanner.nextInt();

	    // Calculate and print the LCM
	    int result = lcm(number1, number2);
	    System.out.println("LCM of " + number1 + " and " + number2 + " is " + result);
	  }

	  public static int lcm(int a, int b) {
	    return (a * b) / hcf(a, b);
	  }

	  public static int hcf(int a, int b) {
	    if (b == 0) {
	      return a;
	    } else {
	      return hcf(b, a % b);
	    }
	  }
}
