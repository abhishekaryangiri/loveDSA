
//nCr = n!/r!(n-r)!
package loveDSA;

public class $8BinomialCoeficient {
	public static int bioFactorial(int n, int r) {
		int  facto_n = factorial(n);
		int facto_r = factorial(r);
		int facto_nmr = factorial(n-r);
		
		int binomialCoe = facto_n/(facto_r * facto_nmr);
		return  binomialCoe;
	}

private static int factorial(int n) {
		int f = 1;
		for( int i=1; i<=n; i++) {
			f = f * i;
		}
		return f;
	}

public static void main(String[] args) {
System.out.println(bioFactorial(10, 5));
}
}
