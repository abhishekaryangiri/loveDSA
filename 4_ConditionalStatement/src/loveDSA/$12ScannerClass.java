//Java User Input
//The Scanner class is used to get user input, and it is found in the java.util package.

//To use the Scanner class, create an object of the class and use any of the available methods found in the //Scanner class documentation. In our example, we will use the nextLine() method, which is used to read //Strings:

//In the example above, we used the nextLine() method, which is used to read Strings. To read other types, look at the table below:

//nextBoolean()	Reads a boolean value from the user
//Mwthod               Description
//nextByte()	   Reads a byte value from the user
//nextDouble()	   Reads a double value from the user
//nextFloat()	    Reads a float value from the user
//nextInt()	Reads a int value from the user
//nextLine()	  Reads a String value from the user
//nextLong()	Reads a long value from the user
//nextShort()	Reads a short value from the user
package loveDSA;

import java.util.Scanner;

public class $12ScannerClass {
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    String userName;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Username is: " + userName);
	}

	
	
	
	
	
	
	

}
