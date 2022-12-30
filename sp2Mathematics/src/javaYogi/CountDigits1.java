package javaYogi;

public class CountDigits1 {
//count digit
	static int countDigits(int n) {
		int ans = 0;
		while( n>1) {
			n = n/10;
			ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int num = 12345;
		System.out.println(countDigits(num));
	}
}
