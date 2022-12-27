//area of triangle  => A=(base*height)/2

package loveDSA;

import java.util.Scanner;

public class AreaOfTriangle9 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter base of triangle");
	int base = ma.nextInt();
	
	System.out.println("enter height of triangle");
	int height  = ma.nextInt();
	
	int area = (base*height)/2;
	
	System.out.println("area of a triangle: "+area);
}
}
