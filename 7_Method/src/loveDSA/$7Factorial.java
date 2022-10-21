package loveDSA;

public class $7Factorial {
	public static int getFactorial(int n) {
		int f = 1;
		for( int i=1; i<=n; i++) {
			f = f * i;
		}
		return f;
	}
public static void main(String[] args) {
	int outp = getFactorial(5);
	System.out.println(outp);
}
}
