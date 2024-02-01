package loveDSA;

import java.util.Scanner;

public class $14ContinueScanner {

	public static void main(String[] args) {

		Scanner abhi = new Scanner(System.in);
		do {
			System.out.println("Enter digit");
			int ui = abhi.nextInt();
			if( ui % 10 == 0) {
				continue;
			}
			System.out.println("Your Input Is :   " + ui);
		}
		while ( true);
	}
}