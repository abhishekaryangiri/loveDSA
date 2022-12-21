/*
 String substring(): This method has two variants and returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string
 */
package loveDSA;

public class WorkingOfSubstring2 {
public static void main(String[] args) {
	  // Initializing String
    String Str = new String("Welcome to geeksforgeeks");

    // using substring() to extract substring
    // returns (whiteSpace)geeksforgeeks
   
    System.out.print("The extracted substring is : ");
    System.out.println(Str.substring(5));
}
}
