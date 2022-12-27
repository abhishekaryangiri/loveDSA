/*
 area of a square:
 TC: 
 */
package loveDSA;

import java.util.Scanner;

public class SquareArea7 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter length of bhuja");
	int bhuja = ma.nextInt();
	
	int area = bhuja * bhuja;
	
	System.out.println("area of square: "+ area);
	
}
}
