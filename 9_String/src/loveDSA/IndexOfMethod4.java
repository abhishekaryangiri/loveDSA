/*
 int indexOf() : This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.
 */
package loveDSA;

public class IndexOfMethod4 {
public static void main(String[] args) {
	  // Initialising string
    String Str = new String("Welcome to geeksforgeeks");

    // Initialising search string
    String subst = new String("geeks");

    // print the index of initial character
    // of Substring
    // prints 11
    System.out.print("Found geeks starting at position : ");
    System.out.print(Str.indexOf(subst));
}
}
