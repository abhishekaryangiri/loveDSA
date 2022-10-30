//funcrion overloading using parameter
package loveDSA;

public class $9FunctionOverloadingUsingParameter {
	// function to calculate sum of 2 no..
	public static int sum(int a, int b) {
		return a+b;
	}
	//fun to cal sum of 3 num..
	public static int sum( int a, int b, int c) {
		return a+b+c;
	}
public static void main(String[] args) {
	System.out.println(sum(20,30));
	System.out.println(sum(20,30,20));
}
}
