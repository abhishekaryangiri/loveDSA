//prime num: divisible by 1 and itself
// found in table of a and itself
package loveDSA;

public class $15CheckPrimeNumber {
public static void main(String[] args) {
	int num = 19;
//	int count = 0;
	for ( int i=2; i<=num-1; i++) {
		if( num%i == 0)  {
		System.out.println(num+ "  -->  is Not a Prime Num");
		break;
	}
	else {
		System.out.println(num+ " -->  Prime Number");
		break;
	}
}
}
}