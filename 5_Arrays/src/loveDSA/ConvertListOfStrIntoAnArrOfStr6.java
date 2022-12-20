/*
 convert a list of strs  {"ab", "bc", "cd", "de", "ef", "fg", "gh"} into an arr of strs and print all strs stored on odd indices of the arr
 output:
 bc
 de
 fg
 */
package loveDSA;

public class ConvertListOfStrIntoAnArrOfStr6 {
public static void main(String[] args) {
	String[] dada = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
	for(  int i=0;i<dada.length;i++ )
	{
		if(i %2 != 0)
		{
			System.out.println(dada[i]);
		}
	}
}
}
