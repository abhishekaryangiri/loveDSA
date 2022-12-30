package javaYogi;

public class LCM8 {
	 public static void main(String[] args) {
		    int number1 = 12;
		    int number2 = 60;
		    int result = hcf(number1, number2);
		    System.out.println("HCF of " + number1 + " and " + number2 + " is " + result);
		  }

		  public static int hcf(int a, int b) {
		    if (b == 0) {
		      return a;
		    } else {
		      return hcf(b, a % b);
		    }
		  }
}
