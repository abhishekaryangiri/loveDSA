//check voting age eligiblity
package loveDSA;

import java.util.Scanner;

public class VotingAgeEligiblity2 {
public static void main(String[] args) {
	Scanner ab = new Scanner(System.in);
	
	System.out.println("enter age");
	int age = ab.nextInt();
	
	if(age >= 18) {
		System.out.println("you are eligible for casting vote");
	}else {
		System.out.println("not eligible");
	}
}
}
