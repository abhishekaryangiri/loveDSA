// 5L -> 0%; | 5-12 L -> 12% | 12 -20 -> 18% | 18+ L 25%
package loveDSA;

import java.util.Scanner;

public class $6IncomTaxCal {
public static void main(String[] args) {
	Scanner abhi = new Scanner(System.in); {
		int lpa = abhi.nextInt();
		int tax = 0;
		
		if ( lpa < 500000) {
			tax = 0;
		}
		else if ( lpa>= 500000 && lpa < 1200000) {
			tax = ( int) ( lpa  *  0.12);
		}
		else if (lpa >= 1200000 && lpa < 2000000) {
			tax = (int) (lpa * 0.18);
		}
		else if ( lpa >= 2000000) {
			tax = (int) (lpa * 0.25);
		} else {
		tax = (int) ( lpa * 0.3);
		}
		System.out.println(  "This Year You Will Pay Tax :   "  + tax );
	}
}
}
