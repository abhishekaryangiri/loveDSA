package loveDSA;

public class PrintTriUsingTwoDigit7 {
	public static void triangleUsing01(int n) {
		for( int i=1; i<=n;i++) {
			for (int j=1; j<=i; j++) {
				if(  (i + j) %2==0) {
					System.out.print("1");
				}else {
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	triangleUsing01(4);
}
}
