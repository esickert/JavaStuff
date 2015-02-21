import java.util.*;

public class Scabble    {
    public static void main(String[] args)  {

    Scanner userInput = new Scanner(System.in);
//    System.out.print("Please enter a word: ");   //"quit" doesn't work here   
    String word;
//    System.out.println(word);
    do  {
        System.out.print("Please enter a word: ");    
        word = userInput.nextLine();
        char[] stringToCharArray = word.toCharArray();
        System.out.println(word);
        for(int i = 0; i < stringToCharArray.length; i ++)  {
            System.out.print(stringToCharArray[i]);
        } //end of for loop
        System.out.println();
    } while ((!word.equals("quit")));   //this doesn't work!!!!!! 



    } //end of main
} //end of class Scabble
