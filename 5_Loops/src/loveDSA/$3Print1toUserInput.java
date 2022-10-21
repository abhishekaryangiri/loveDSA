package loveDSA;

import java.util.Scanner;

public class $3Print1toUserInput {
	public static void main(String[] args) {
		System.out.println("Please write your number:");
		Scanner abhi = new Scanner(System.in);
		int ui = abhi.nextInt()	;
		
		int start = 1;
		while (start <= ui) {
			System.out.println(start);
			start++;
		}
				}

}
