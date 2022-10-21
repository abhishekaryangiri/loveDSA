package loveDSA;

import java.util.Scanner;

public class $11ProjectCal {
	public static void main(String[] args) {
	Scanner abhi = new Scanner(System.in);
	System.out.println("Enter the value of a :  ");
	int a = abhi.nextInt();
	System.out.println("enter Operator:  ");
	char operator = abhi.next().charAt(0);
	System.out.println("Enter the value of b :  ");
	int b = abhi.nextInt();
	
	switch (operator) {
	case '+' : System.out.println("Output :  " + a + b);
	break;
	case '-' : System.out.println("Output :  " +   (a-b));
	break;
	case '*' : System.out.println("Output :  " + a*b);
	break;
	case '/' : System.out.println("Output :  " + a/b);
	break;
	case '%' : System.out.println("Output :  " + a%b);
	default : System.out.println("Error 404");
	}
}
}
