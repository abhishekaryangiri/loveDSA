// variable = condition ? state1 : state2
//int larger = (20>8)?20:8
//true  will be saved in larger int

// second way to write if-else cond.
// /  ? -> we want to check condition ( if cond is true then)-->
//  statement1  ->  willl be exicuted( act as a true statement)
// : -> otherwise
// statement 2 ( always act false) will be exicuted
//if value is return then will be saved in variable.
package loveDSA;

public class $8TernaryOperators {
public static void main(String[] args) {
	
//	int num = 20;
//	String type = (num % 2 ==0) ?  "even":"odd";
//	System.out.println(type);
	
	int nums = 80;
	String type = (nums % 5 ==0) ? "divisible" : "Not Divisible";
	System.out.println(type);
	
}

}
