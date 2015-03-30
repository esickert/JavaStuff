import java.util.*;

public class Backwards    {

    public static void main(String[] args)  {

    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = userInput.next();

    char[] charArray = word.toCharArray();
//    char[] charArray[0];
    System.out.println(charArray.length);
   // String temp = charArray[0];
//    System.out.println(charArray[charArray.length - 1]);   //outOfBounds because indices start at 0; need -1
    for (int i = (charArray.length - 1); i >= 0; i--)
        System.out.print(charArray[i]);
    System.out.println();

    } // end of main
}// end of class
