import java.util.*;

/***********************************************************************/
/* Midterm take home assignment                          Erich Sickert */
/*                                                                     */
/* "Write a program that reads in a number from the user and then      */
/* displays the Hailstone sequence for that number."                   */
/*                                                                     */
/* This program prompts the user for a positive number. If the user    */
/* in puts 1, 0, or a negative number the program will terminate       */
/* with a message "Invalid input!". I started to write the program to  */
/* prompt again but that was not asked for in the directions.          */
/***********************************************************************/

public class TheHailstoneSequence	{
      /** Main method  */
    public static void main(String[] args)	{
    
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a positve number: ");
        int inputNumber = userInput.nextInt();
        
        collatzConjecture(inputNumber);  

    } //end of main

    public static void collatzConjecture(int number)  {
        int count = 0;
        if (number <= 0)        
            System.out.println("Invalid input!");
        else    {
            while (number != 1)    {   
                if (number % 2 == 0)   {
                    int temp = number;
                    number = number / 2;
                    System.out.println(temp + " is even, so I take half:\t " + number);
                } //end of if 
                else    {
                    int temp = number;
                    number = (number * 3) + 1;
                    System.out.println(temp + " is odd so I make 3n+1:\t " + number);
                } //end of else
                ++count;
            } //end of while loop
        System.out.println("The process took " + count + " times to reach 1.  OPA!");
        } //end of else
        
    } // end of collatzConjecture
} // end of TheHailstoneSequence
    
