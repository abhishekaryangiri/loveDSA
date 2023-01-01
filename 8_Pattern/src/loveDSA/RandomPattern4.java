package loveDSA;

public class RandomPattern4 {
public static void main(String[] args) {
	int k=8;
	for(int i=1;i<=8;i++) {
		for( int j=1;j<=k-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
