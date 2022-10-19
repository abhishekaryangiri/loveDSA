// &&, ||, ! -> usees: where we want to make logic like if etc
// || : or
//&& both should ne folow
package loveDSA;

public class $4LogicalOper {
public static void main(String[] args) {
	System.out.println((3<2)  || (4>5));
	System.out.println((3>2)  || (4>5));
	System.out.println((3>2)  && (4>5));
	System.out.println((3>2)  || (4<5));
	System.out.println( !( 9<3));
}
}
