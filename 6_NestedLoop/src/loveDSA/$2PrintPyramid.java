package loveDSA;

public class $2PrintPyramid {
public static void main(String[] args) {
	int k = 6;
	for( int i=1; i<=k; i++) {
		for( int j=1; j<=i; j++) {
			System.out.print(j +  " ");
		}
		System.out.println();
	}
}
}
