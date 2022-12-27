/*
 
 area of Parallelogram:
 
 area=b*h
 
 b- base
 h- vertical height
 
 */
package loveDSA;

import java.util.Scanner;

public class areaOfParallelogram11 {
public static void main(String[] args) {
	Scanner ma = new Scanner(System.in);
	
	System.out.println("enter base");
	int base = ma.nextInt();
	
	System.out.println("enter vertical height");
	int vh = ma.nextInt();
	
	int area_Parallelogram = base*vh;
	
	System.out.println("area of Parallelogram: "+area_Parallelogram);
}
}
