/*
 
 check user input is positive or not?
 */
package loveDSA;

import java.util.Scanner;

public class CheckPositiveNum1 {
public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
	
	System.out.println("enter input");
	int i = ab.nextInt();
	
	if( i >0) {
		System.out.println("given input is positive number");
	}
	else  if ( i==0){
		System.out.println("given input is Zero");
	}else {
		System.out.println("given input is negative");
	}
}
}
