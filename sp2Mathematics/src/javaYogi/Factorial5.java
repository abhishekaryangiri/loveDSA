package javaYogi;

public class Factorial5 {
public static void main(String[] args) {
		    int number = 5;
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
