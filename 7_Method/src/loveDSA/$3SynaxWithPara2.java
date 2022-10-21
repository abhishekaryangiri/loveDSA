package loveDSA;

import java.util.Scanner;

public class $3SynaxWithPara2 {
	public static void addNum( int bag1, int bag2) {
		//to run a+b , we provide parameter, a & b will identifiy there value
		int addition = bag1+ bag2;
		System.out.println("Sum :  " + addition );
	}
	public static void main(String[] args) {
		System.out.println("Enter First Value");
		Scanner abhi = new	Scanner(System.in);
		int a = abhi.nextInt();
		System.out.println("Enter Second Value");
		int b = abhi.nextInt();
	addNum(a, b);
	}

}
