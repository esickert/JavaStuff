import java.util.*;

public class TestCharacters  {
    /** main method */
    public static void main(String[] args)  {
    
        char temp;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a string of characters: ");
        String s = userInput.nextLine();
        System.out.println(s);
        
        Characters stuff = new Characters();
        /***************************************************************/
        //This is from Liang's book. It counts the occurances of a letters
        //in an input string. It's got some interesting code tweeks that
        // I don't fully understand. 
        /***************************************************************/
        int[] counts = stuff.countLetters(s.toLowerCase());

        String output = "";

        for(int i = 0; i < counts.length; i++)  {
            if (counts[i] != 0)
                output = output + (char)('a' + i) + " appears "
                                //conditional expression   
                + counts[i] + ((counts[i] == 1) ? " time\n" : " times\n");
        }
        System.out.println(output);
        /***************************************************************/
        System.out.println(stuff.getChar());
        stuff.setChar('b');
        temp = stuff.getChar();
        System.out.println("The character is " + temp);
    

    } //end of main
} // end of class

        
