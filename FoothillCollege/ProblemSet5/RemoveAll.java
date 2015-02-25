/***********************************************************************/
/** Assignment 5.3                                      Erich Sickert
/* "Write a method public String removeAllOccurrences(String str, char ch)
/*  that removes all occurrences of the character ch from the string str. 
/*   For example, your method should return the values shown:
/* removeAllOccurrences("This is a test", 't') returns "This is a es"
/* removeAllOccurrences("Summer is here!", 'e') returns "Summr is hr"
/* removeAllOccurrences("---0---", '-') returns "0"  -     remove the dashes but leave the 0"
              
/*  The program prompts the user to enter a string of letters. It then
/* asks the user to enter a charater to delete from that string.
/***********************************************************************/
import java.util.*;

public class RemoveAll   {
    public static void main(String[] args)  {
 
	Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a sentence followed by a <return>: ");    
        String sentence = userInput.nextLine();
        System.out.print("Enter a character to delete: "); 
        char character = userInput.next().charAt(0);
        
	System.out.println(sentence);
	String newStr = removeAllOccurances(sentence,character);
	System.out.println(newStr);

    } //end of main

/***********************************************************************/
/**  The method removeAllOccurrences takes two parameters, a string and 
/*  a character. It then returns a string with all instances of the 
/*  character removed. 
/***********************************************************************/

    public static String removeAllOccurances(String str, char c)	{
 
	String newChar = String.valueOf(c);
	String newReplace = str.replaceAll(newChar,"");
	return newReplace;
    } //end of method removeAllOccurances
    
} //end of TestTime
