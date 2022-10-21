package loveDSA;

import java.util.Scanner;

public class $15CheckPrimeScanner {

	public static void main(String[] args) {
		System.out.println("Enter Num");
		try (Scanner abhi = new Scanner(System.in)) {
			int ui = abhi.nextInt();
		
			for ( int i=2; i<=ui-1; i++) {
				if(ui%i==0) {
					
					System.out.println(ui+ "   ->Not a Prime Number");
					break;
				}else {
					System.out.println(ui+ "    -> is a Prime Numb");
					break;
				}

			}
	}

}
}