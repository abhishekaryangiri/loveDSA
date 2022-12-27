/*area of a circle:- 
 
 radius of circle(r)
 
Area_Circle = PI* r*r

*/
package loveDSA;

import java.util.Scanner;

public class AreaOfCircle10 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter radius of circle");
	int r = ma.nextInt();
	double pi = Math.PI;
	
	double area_Circle = (double) (pi * r * r);
	
	System.out.println("area of circle: "+area_Circle);
}
}
