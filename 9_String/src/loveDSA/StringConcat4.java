/*
 The Java String concat() method concatenates one string to the end of another string. 
 */
package loveDSA;

public class StringConcat4 {
public static void main(String[] args) {
	 // Custom string 1
    String str1 = "Computer ";

    // Custom string 2
    String str2 = " Science ";

    // Combining above strings by
    // passing one string as an argument
    String str3 = str1.concat(str2);

    // Print and display temporary combined string
    System.out.println(str3);

    String str4 = " Portal";
    String str5 = str3.concat(str4);
    System.out.println(str5);
}
}
