package loveDSA;

public class $Rectangle {
public static void main(String[] args) {
	int r=6, c=21;
	for(int i=1; i<=r; i++) {
		for( int j=1; j<=c; j++) {
			if( i==1 || i==r || j== 1 || j==c)
			
				System.out.print("* ");
			else 
				System.out.print("   ");
		}
			System.out.println();
		}
	}
}
