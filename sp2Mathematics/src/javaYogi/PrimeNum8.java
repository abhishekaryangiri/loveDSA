package javaYogi;

public class PrimeNum8 {
//prime num
	public static boolean isPrime(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		if (isPrime(10)) {
		    System.out.println("10 is a prime number.");
		} else {
		    System.out.println("10 is not a prime number.");
		}
	}
}
