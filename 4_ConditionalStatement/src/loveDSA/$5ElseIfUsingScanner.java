package loveDSA;

import java.util.Scanner;

public class $5ElseIfUsingScanner {
	public static void main(String[] args) {
		try (Scanner ag = new Scanner(System.in)) {
			int age = ag.nextInt();
			if ( age < 16) {
				System.out.println("Go to School");
				} 
			else if ( age > 16 && age < 25) {
					System.out.println("Go to College");
			}else {
				System.out.println("Go to emple");
			}
		}
	}
}
