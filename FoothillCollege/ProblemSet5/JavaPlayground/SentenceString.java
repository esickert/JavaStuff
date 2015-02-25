/***********************************************************************/
/** Assignment 5.3                                      Erich Sickert
/* "Write a method public String removeAllOccurrences(String str, char ch)
/*  that removes all occurrences of the character ch from the string str. 
/*                 
/*  The program prompts the user to enter a string of letters. It then
/* asks the user to enter a charater to delete from that string.
/***********************************************************************/
import java.util.*;

public class SentenceString    {   
    /** main method  */
    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a sentence followed by a <return>: ");    
        String sentence = userInput.nextLine();
        System.out.print("Enter a character to delete: "); 
        char character = userInput.next().charAt(0);
        
        String output = removeAllOccurrences(sentence,character);
        System.out.println(output);

        } // end of main
        
/***********************************************************************/
/**  The method removeAllOccurrences takes two parameters, a string and 
/*  a character. It then returns a string with all instances of the 
/*  character removed. The string is converted into an array of 
/*  characters, character removed, and then reconverted back to a
/*  string value.
/***********************************************************************/

        public static String removeAllOccurrences(String str, char ch)   {
            char[] stringToCharArray = str.toCharArray();     // converts string to a character array
            char[] result = new char[stringToCharArray.length];  

            for (int i = 0; i < (stringToCharArray.length); i++)  {
                if (stringToCharArray[i] == ch)    {  
                    result[i] = stringToCharArray[i + 1];
                    i++;
                }  //end of if
                else 
                    result[i] = stringToCharArray[i];
            } //end of for loop
            String resultString = new String(result);         // converts character array back to a string
            return resultString;   
        } //end of method removeAllOccurrences
    
} // end of SentenceString
    
