//if (1)->else if(2) -> else(3)
// 1 true-> print > 1 false -> print2 > 1 &2 both false-> print 3
package loveDSA;

public class $4ElseIf {
		public static void main(String[] args) {
			//int age = 18;
			int age = 55;
			//int age = 23;
			if ( age < 16) {
				System.out.println("Go to School");
				} 
			else if ( age > 16 && age < 25) {
					System.out.println("Go to College");
			}else {
				System.out.println("Go to emple");
			}
		}
}
