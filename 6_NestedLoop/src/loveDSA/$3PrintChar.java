package loveDSA;

public class $3PrintChar {
	public static void main(String[] args) {
		char abhi = 'A';
		int chakra = 6;
		for( int i=1; i<=chakra; i++) {
			for( int j=1; j<=i; j++) {
				System.out.print(abhi );
				abhi++;
			}
			System.out.println();
		}
	}
}
