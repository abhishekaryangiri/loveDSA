/*
 => Avgerage  of three num
 
 
 */
package loveDSA;

import java.util.Scanner;

public class Avegare6 {
public static void main(String[] args) {
	Scanner ma =new Scanner(System.in);
	
	System.out.println("enter first number");
	int i = ma.nextInt();
	System.out.println("enter second number");
	int j = ma.nextInt();
	System.out.println("enter third number");
	int k = ma.nextInt();
	
	int avg = (i+j+k)/3;
	
	System.out.println("Average: "+ avg);
}
}
