package loveDSA;

import java.util.Scanner;

public class $17CheckPrimeSca {
	public static void main(String[] args) {
		Scanner abhi = new Scanner(System.in);
		int ui = abhi.nextInt();
		
		boolean check = true;
		for( int i=2;i<Math.sqrt(ui);i++) {
			//for( int i=2; i<ui; i++) {
			if( ui%i==0)
			check = false;
		}
	
	if(check==true) {
		System.out.println( ui+ "  -> Prime");
	}else {
		System.out.println( ui+"   -> not prime");
	}
	}
}
