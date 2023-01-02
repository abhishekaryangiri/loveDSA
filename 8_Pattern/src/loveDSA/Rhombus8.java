package loveDSA;

public class Rhombus8 {
	
	public static void rhombusPattern(int n) {
		for( int i=1; i<=n; i++) {
			for( int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for( int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	rhombusPattern(6);
}
}
