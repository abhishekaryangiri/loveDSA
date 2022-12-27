/*
 
 calculate total bill after 18% tax
 */
package loveDSA;

import java.util.Scanner;

public class RestaurantBillWithTax13 {
public static void main(String[] args) {
	 Scanner maa = new Scanner(System.in);
	 
	 System.out.println("enter itoms price");
	 float gobhiParatha = maa.nextFloat();
	 
	 System.out.println("enter itoms price");
	 float dahi = maa.nextFloat();
	 
	 System.out.println("enter itoms price");
	 float makhan = maa.nextFloat();
	 
	 System.out.println("enter itoms price");
	 float alooParatha = maa.nextFloat();
	 
	 float bill = (gobhiParatha + dahi + makhan + alooParatha);
	 
	 System.out.println("Bill is :  " + bill);
	 //after tax
	 float billWithTax =  bill + ( 0.18f  * bill);
	 
	 System.out.println("Bill with 18% tax:  "+ billWithTax);
	 
	 float tax = (0.18f * bill);
	 System.out.println("note => Tax is: " + tax);
}
}
