/*
 Area of a Rectangle:
 TC:
 */
package loveDSA;

import java.util.Scanner;

public class AreaOfRectangle8 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter length of rectangle");
	int l = ma.nextInt();
	
	System.out.println("enter width of rectangle");
	int w = ma.nextInt();
	
	int area = l*w;
	
	System.out.println("area of a rectangle: "+area);
}
}
