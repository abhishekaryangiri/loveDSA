/*
 Working of charAt() method:
 The Java String charAt() method returns the character at the specified index.
 */
package loveDSA;

public class CharAtMethod1 {
public static void main(String[] args) {
	String s = "Welcome! to Geeksforgeeks Planet";
	 
    char ch = s.charAt(3);
    System.out.println(ch);

    ch = s.charAt(0);
    System.out.println(ch);
    
    ch = s.charAt(1);
    System.out.println(ch);
}
}
