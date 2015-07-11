import java.util.Scanner;

public class PerfectNumber	{

    /**   Main method   */
    public static void main(String[] args)	{

    Scanner userInput = new Scanner(System.in);
    System.out.print("Please Enter a number: ");
    int N = userInput.nextInt();

    perfectNum(N);
    nextPerfectNumber();
    } //end of main

/************************************************************************/
/* "Write a program that reads in an integer N from the keyboard, and   */
/*    displays whether N is a "perfect number" or not. A number is      */
/*    "perfect" if it is equal to the sum of all of its factors (not    */
/*    including itself as a factor, but including 1 as a factor). 6 is  */
/*    the first perfect number, because its factors are 1, 2, and 3,    */
/*      and 1+2+3 = 6."                                                 */
/*                                                                      */
/* perfectNum takes input from the user via the keyboard and            */
/* determines if that number is purrfect. It displays the factors of    */
/* that input number and their sum. If that sum is equal to the input   */
/* number, it will display a message as such that the input             */
/* is "purrfect"!                                                       */
/************************************************************************/

    public static void perfectNum(int number)	{
        int temp = 0;

        for(int i = 1; i < number; i++) {
            if ( number % i == 0)   {
                temp = temp + i;
                System.out.println(i + " is a factor of " + number);
            }  //end of if statement
        }  //end of for loop
        System.out.println(temp + " is the sum of all factors of " + number);
        
        if (temp == number)    
            System.out.println(number + " is also a purrrrfect number!!!");
        else    
            System.out.println(number + " is NOT a purrfect number!!!!!");
    } //end of method perfectNum

/************************************************************************/
/*"Add a loop to your program to find the next perfect number after 6." */
/*                                                                      */
/* nextPertfectNumber takes a variable "number" and initializes it to   */
/* 7. It then calculates the next perfect number after 7...28. It could */
/* easily be setup to take parameter N (any number input from the user) */
/* and compute the next perfect number after N (N is passed to "number")*/
/************************************************************************/  
    public static void nextPerfectNumber()  {
        int number = 7;
        int temp = 0;
      
        while (temp != number)  {
            temp = 0;  //this reinitializes temp to 0 for each loop
            for(int i = 1; i < number; i++) {
                if ( number % i == 0)   {
                temp = temp + i;
                }  //end of if statement
            }  //end of for loop
            if (temp == number) {    
                System.out.println(number + " IS a purrrfect number though!");
            }  //end of if statement       
            else    
                number++;
        } //  end of while loop
    }  //end of method nextPerfectNumber  
          
}  //end of class PerfectNumber
