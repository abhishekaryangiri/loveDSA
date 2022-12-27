//Check Leap Year
package loveDSA;

import java.util.Scanner;

public class CheckLeapYear3 {
public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
	
	System.out.println("enter year");
	int yr = ab.nextInt();
	
	boolean i =  yr % 4 ==0;
	boolean j = yr % 100 !=0;
	boolean k = yr % 100 == 0 && yr % 400 == 0 ;
	
	if( i && (j ||k) ) {
		System.out.println(yr +"  : Leap year");
	}
	else {
		System.out.println(yr+ "  : not a Leap year");
	}
}
}
