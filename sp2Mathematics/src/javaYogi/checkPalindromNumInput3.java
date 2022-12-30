package javaYogi;

import java.util.Scanner;

public class checkPalindromNumInput3 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // Read the number from the user
	    System.out.print("Enter a number: ");
	    int number = scanner.nextInt();

	    // Check if the number is a palindrome
	    if (isPalindrome(number)) {
	      System.out.println(number + " is a palindrome.");
	    } else {
	      System.out.println(number + " is not a palindrome.");
	    }
	  }

	  public static boolean isPalindrome(int number) {
	    // Check if the number is negative (palindromes are non-negative)
	    if (number < 0) {
	      return false;
	    }

	    // Reverse the number
	    int reverse = 0;
	    int num = number;
	    while (num > 0) {
	      reverse = reverse * 10 + num % 10;
	      num /= 10;
	    }

	    // Check if the reversed number is equal to the original number
	    return number == reverse;
	  }
}
