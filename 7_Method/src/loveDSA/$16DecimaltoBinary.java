//decimal to binary
//
package loveDSA;

public class $16DecimaltoBinary {
public static void deciToBin( int n) {
	int providedNum = n;
	int pow = 0;
	int binaryNum = 0;
	
	while(n>0) {
		int rem = n%2;
		binaryNum = binaryNum +( rem *  (int)Math.pow(10, pow));
		pow++;
		n = n/2;
	}
	System.out.println("Binary num " + providedNum+ " is : "+binaryNum);
}
public static void main(String[] args) {
	deciToBin(1001);
}
}
