//bit  means -> 0,1
//binary-> 0, 1

package loveDSA;

public class $15BinaryToDecimal {
public static void binaryToDecimal(int binaryNum) {
	int providedNum = binaryNum;
	int pow = 0;
	int dec = 0;
	
	while (binaryNum > 0) {
		int lastDig = binaryNum % 10;
		dec = dec + (lastDig *( int ) Math.pow(2, pow));
		
		pow++;
		binaryNum = binaryNum/10;
	}
	System.out.println("Decimal of  "+ providedNum+  " is : "   + dec);
}
public static void main(String[] args) {
	binaryToDecimal( 1001);
}
}
