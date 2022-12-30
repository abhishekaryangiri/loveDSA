package javaYogi;

public class PalindromeNum2 {
//check palindrome num
	static boolean checkPalindrome(int n) {
		int rev = 0;
		int count = n;
		while( count != 0) {
			rev = (rev*10) + (rev%10);
			count = count/10;
		}
		return (rev == n);
		//if it is true then it will return 1 , if false then 0

	}
	public static void main(String[] args) {
		int n = 1001;
		if(checkPalindrome(n) == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
