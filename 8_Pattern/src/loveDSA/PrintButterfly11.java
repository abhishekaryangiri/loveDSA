package loveDSA;

public class PrintButterfly11 {
public static void main(String[] args) {
	int n=6;
	
	//upper half
	for( int i=1; i<=n;i++) {
		//1st part
		for( int j=1; j<=i;j++) {
			System.out.print("*");
		}
		//print spaces
		int sps = 2* (n-i);
		for (int j=1; j<=sps; j++) {
			System.out.print("  ");
		}
		//2nd part
		for(int  j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//lower half

	for( int i=n; i>=1;i--) {
		//1st part
		for( int j=1; j<=i;j++) {
			System.out.print("*");
		}
		//print spaces
		int sps = 2* (n-i);
		for (int j=1; j<=sps; j++) {
			System.out.print("  ");
		}
		//2nd part
		for( int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
