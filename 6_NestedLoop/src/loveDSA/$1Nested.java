//nested-> loop inside loop

package loveDSA;

public class $1Nested {
	public static void main(String[] args) {
		for( int i=1; i<=5; i++) {
			for ( int j=1; j<=i; j++) {
				//for ( int j=i; j<=5; j++) {
				System.out.print("*" + "  ");
			}
			System.out.println();  //next line
		}
	}
}
