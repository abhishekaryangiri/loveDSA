//call by value: java always call by value:  all changes will be inside change
package loveDSA;

public class $5CallByValueSwap {
	public static void swap(int a, int b) {
		//swaping
		int temp = a;
		a= b;
		b = temp;
		System.out.println("a:  " + a);
		System.out.println("b  :  " +b);
	}
	public static void main(String[] args) {
		//swap -> vales exchange
		int a = 10;
		int b = 20;
	swap(a,b);
	//if we print here then original value will be printed
	}

}
