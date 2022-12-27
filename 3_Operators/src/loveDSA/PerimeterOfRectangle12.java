//perimeter of rectangle = 2(l1+ l2)
//Perimeter is total distance covered by the boundary of a shape
package loveDSA;

import java.util.Scanner;

public class PerimeterOfRectangle12 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter length of side1");
	int L1 = ma.nextInt();
	
	System.out.println("enter length of side2");
	int L2 = ma.nextInt();
	
	int perimeter_rec = 2*( L1+L2);
	
	System.out.println("perimeter of rectangle : "+perimeter_rec);
}
}
