package loveDSA;

public class $9RevNum1 {
	public static void main(String[] args) {
		int num = 123456789;
		 while ( num > 0){  //when the value of num will be 0 then loop break
			 int rev = num%10;
			 System.out.print(rev + "  ");
			 num = num/10;
		 }
	}
}
