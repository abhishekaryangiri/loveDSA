package loveDSA;

public class IndexOfMethod4a {
	   // function to check if the passed 
    // character is a vowel
public static boolean vowel(char c)
{
    return "aeiouAEIOU".indexOf(c)>=0;
}

    // Driver program
public static void main(String[] args)
{
    boolean isVowel = vowel('a');
     
            // Printing the output
            if(isVowel)
        System.out.println("Vowel");
    else
        System.out.println("Consonant");
}
}
