/*
 Transverse over the element of the array  {1, 2, 3,4,5,6,7,8,9,10,12}  using the each loop and print all even elements
 output:
 2
 4
 .
 .
 12
 */
package loveDSA;

public class Transverse7 {
public static void main(String[] args) {
	int[] dada = {1, 2, 3,4,5,6,7,8,9,10,12} ;
	for( int kaka : dada)
	{
		if( kaka % 2 ==0)
		{
			System.out.println(kaka);
		}
	}
}
}
