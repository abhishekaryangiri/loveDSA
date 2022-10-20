package loveDSA;

import java.util.Scanner;

public class $4SunFirstnNatNum {
	public static void main(String[] args) {
		System.out.println("Please Enter Number here:");
		Scanner abhi = new Scanner(System.in);
		int  userInput = abhi.nextInt();
		int sum = 0;
		int start = 1;
		 while( start <= userInput ) {
			 sum+=start;
			 start++;
		 }
		 System.out.println(sum);
	}

}
