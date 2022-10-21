package loveDSA;
// unit digit method
public class $8ReverseNum {
public static void main(String[] args) {
	int num = 123456789;
	int reverse = 0;
	while( num>0) {
		int ld = num%10;
		reverse= (reverse* 10) + ld;  // rev = (rev *10) + last digit
		num = num/10;
	}
	System.out.print(reverse);
}
}
