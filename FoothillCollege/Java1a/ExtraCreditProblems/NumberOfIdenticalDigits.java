/***********************************************************************/
/** Extra credit Problem 1                               Erich Sickert
/* "Examine a number and count the number of occurrences of every digit.
/*  Example: The number 229231007 contains two 0s, one 1, three 2s, 
/*  one 7, and one 9."  and one 3.
/*
/*  The program can prompt the user for input or use the supplied
/*  example of 229231007. If the user input is used the integer is
/*  converted into a String by Integer.toString(). that is then passed
/*  to the method identicals.
/***********************************************************************/

import java.util.*;

public class NumberOfIdenticalDigits {
    /** main method  */
    public static void main(String[] args)  {

/*        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number with different digits: ");
        int number = userInput.nextInt();
        String anotherString = Integer.toString(number);     */

        String anotherString = "229231007";

        identicals(anotherString);

    } // end of main

/***********************************************************************/
/** The method identicals takes a parameter of a string and counts
/*  the number of specific individual digits there are contained thereof.
/***********************************************************************/

    public static void identicals(String aString)   {
        int count = 0;
        for (int i = 0; i < 10; i ++) {     
            for (int j = 0; j < aString.length(); j++) {
                if ((aString.charAt(j) == (char)('0' + i)))  {
                    count++;
                } //end of if
            } //end of for loop
            if (count == 0) 
                continue;
            System.out.println("The number contains "  + count + " instances of " + i);
        count = 0;
        } //end of for loop
    } // end of method identicals

}  //end of class NumberOfIdenticalDigits
