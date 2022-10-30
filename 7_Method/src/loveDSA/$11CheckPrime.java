//
package loveDSA;

public class $11CheckPrime {
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int i=2; i<=n-1; i++) {
			if( n%i==0) {
				isPrime = false;
				//return false;
				break;
			}
		}
		return isPrime;
		//return  true;
	}
public static void main(String[] args) {
//	isPrime(5);
	System.out.println(isPrime(401));
}
}
