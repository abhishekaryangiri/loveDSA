/*
 calculate the min ellement in an array  {2, 4, 10, -1, -8, 12,6, 60, 122}  using std library method for calculating the min element
 
 */
package loveDSA;

public class CalMinElemInInArr8 {
public static void main(String[] args) {
	int[] dada =   {2, 4, 10, -1, -8, 12, 6,  60, 122} ;
	for( int i=1; i<dada.length-1; i++)
	{
		if ( dada [i-1]  <  dada [i]  && dada [i]  >  dada [i+1])
		{
			System.out.print(dada[i]);
			break;
		}
	}
}
}
