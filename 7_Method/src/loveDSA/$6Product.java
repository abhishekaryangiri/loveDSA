package loveDSA;

public class $6Product {
	public static int  mul(int a, int b) {
		int pro = a*b;
		return pro;
	}
	public static void main(String[] args) {
		int i = 10;
		int j =80;
		int  output = mul(i, j);
		System.out.println("product :  "+ output);
		
		output = mul(40, 60);
		System.out.println("Second mul:  "+output);
		
	}

}
