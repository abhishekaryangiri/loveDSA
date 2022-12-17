package loveDSA;

public class $1RecShape {
public static void printRec(int row, int col) {
	//outer loop
	for ( int i=1; i<=row; i++) {
		//inner col
		for( int j=1; j<=col; j++) {
			if(i ==1 || i== row || j==1 || j == col) {
				System.out.print("*");
			}else {
				System.out.print("");
			}
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	printRec(4,5);
}
}
