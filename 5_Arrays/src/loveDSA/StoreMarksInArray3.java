package loveDSA;

import java.util.Scanner;

public class StoreMarksInArray3 {
public static void main(String[] args) {
	//Aray: list of element of same types placed in contiguous memory location
	int score[] = new int[4];
	Scanner ab = new Scanner(System.in);
	
	System.out.println("enter unit1 score");
	score[0] = ab.nextInt();
	System.out.println("enter unit2 score");
	score[1] = ab.nextInt();
	System.out.println("enter unit 3 score");
	score[2] = ab.nextInt();
	
	int avg = (score[0]+score[1]+score[2]) /3;
	
	System.out.println("Unit 1 Score:  "+ score[0]);
	System.out.println("Unit 1 Score:  "+ score[1]);
	System.out.println("Unit 1 Score:  "+ score[2]);
	
	System.out.println("Average Score:  "+avg);
}
}
