/*
 Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
 */
package loveDSA;

public class LastIndex5 {
	 // Initialising String
	public static void main(String[] args) {
	
    String Str = new String("Welcome to geeksforgeeks");

    System.out.print("Found Last Index of g at : ");

    // Last index of 'g' will print
    // prints 19
    System.out.println(Str.lastIndexOf('g'));
}
}
