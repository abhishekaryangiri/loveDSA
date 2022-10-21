//former parameter: normal param, formal value dont more impo
// actual para: fun call k tym, actual value pass to fun

package loveDSA;

import java.util.Scanner;

public class $4SynWithPara3 {
	public static int addNum( int bag1, int bag2) { //parameter or formerparameter
		//to run a+b , we provide parameter, a & b will identifiy there value
		int addition = bag1+ bag2;
		return addition;
	}
	public static void main(String[] args) {
	
		Scanner abhi = new	Scanner(System.in);
		
		System.out.println("Enter First Value");
		int a = abhi.nextInt();
		
		System.out.println("Enter Second Value");
		int b = abhi.nextInt();
		
		int addition = addNum(a, b); //caling value are called argumenr or actual parameter
	
	System.out.println("Sum :  " + addition );
	}
}