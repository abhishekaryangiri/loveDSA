
// 12345
//54321
//last digit concept : if we devide any num by 10 then we will get rem that is last digit 1234%10 -> 4
//remoive last digit  num/10( 1234/10 -> 123)
package loveDSA;

public class $7ReverseNum {
		public static void main(String[] args) {
			int num = 12345;
			while (num>0) {
				int ld = num%10;  //getting last digit
				System.out.print(ld); // printing last digit
				num = num/10; // removing last digit every time
			}
//			System.out.println();
		}
}
