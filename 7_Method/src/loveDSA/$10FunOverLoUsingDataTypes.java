//second type of function overloading
//uses: using data type
// same sum fun of different data type
package loveDSA;

public class $10FunOverLoUsingDataTypes {
	//function to calculate integer sum
	public static int sum(int a, int b) {
		return a+b;
	}
	//fun to cal float sum
	public static float sum(float a, float b) {
		return a+b;
	}
public static void main(String[] args) {
	System.out.println(sum(20,30));
	//always write f at last position of float value
	System.out.println(sum(20.5f, 30.5f));
}
}
