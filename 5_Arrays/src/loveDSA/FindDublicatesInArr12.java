/*
 Find dublicates in array
 */
package loveDSA;

public class FindDublicatesInArr12 {
	public void hasDublicates(int[] arrA) {
		for( int i=0; i<arrA.length; i++)
		{
			for ( int j=i+1; j<arrA.length; j++)
			{
				if(arrA[i] == arrA[j])
				{
					System.out.println("Array has dublicates:  "+ arrA[i]);
				}
			}
		}
	}
public static void main(String[] args) {
	int op[] = {2, 4, 5, 3, 6, 2, 10, 5};
	 new FindDublicatesInArr12().hasDublicates(op);
}
}
