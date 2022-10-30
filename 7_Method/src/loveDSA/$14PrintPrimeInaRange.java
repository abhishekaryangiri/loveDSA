//print prime from 2 to n
package loveDSA;

public class $14PrintPrimeInaRange {
	public static boolean isPrime(int n) {
		if( n==2) {
			return true;
		}
		for( int i=2; i<=Math.sqrt(n); i++) {
			if( n%i ==0) {
				return false;
			}
		}
		return true;
	}
public static void printPrime(int n) {
	for (int i=2; i<=n; i++) {
		if(isPrime(i)) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
public static void main(String[] args) {
//System.out.println(printPrime(10));
	printPrime(50);
}
}
