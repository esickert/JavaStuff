import java.util.*;

public class SentenceString    {   
    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);
//        System.out.print("Please enter a sentence followed by a <return>: ");    
//        String sentence = userInput.nextLine();
        //String sentence = "Summer is here!";
        String sentence = "This is a test!!";
        char[] stringToCharArray = sentence.toCharArray();
        char[] result = new char[stringToCharArray.length]; 

        System.out.println(result);
        int index = 0;
        for (int i = 0; i < stringToCharArray.length; i++)  {
            if (stringToCharArray[i] == 't')  
                i++;
            else 
                result[i] = stringToCharArray[i];
             
        System.out.println(result);
        } //end of for loop           

/*        ArrayList<String> sentence = new ArrayList<String> ();
        sentence.add("The is a test");
        System.out.println(sentence);   */

    } // end of main
} // end of SentenceString
    
