/*Write a program that reads in an integer N from the keyboard, and displays
whether N is a "perfect number" or not. A number is "perfect" if it is equal 
to the sum of all of its factors (not including itself as a factor, but
including 1 as a factor). 6 is the first perfect number, because its factors
are 1, 2, and 3, and 1+2+3 = 6.
 
Add a loop to your program to find the next perfect number after 6. */



import java.util.Scanner;

public class PerfectNumber	{

    //*   main method   */
    public static void main(String[] args)	{

    Scanner userInput = new Scanner(System.in);
    System.out.print("Please Enter a number: ");
    int N = userInput.nextInt();
//    int N = 8;
    perfectNum(N);
    nextPerfectNumber(N);
    } //end of main

    public static void perfectNum(int number)	{
        int temp = 0;

        for(int i = 1; i < number; i++) {
            if ( number % i == 0)   {
                temp = temp + i;
                System.out.println(i + " is a factor of " + number);
            }
        }  //end of for loop
        System.out.println(temp + " is the sum of all factors of " + number);
        
        if (temp == number)    
            System.out.println(number + " is also a purrrrfect number!!! Yeah this is purrrfect");
        else    
            System.out.println(number + " is NOT a purrfect number!!!!!");
    } //end of method perfectNum

    public static void nextPerfectNumber(int number)  {
       // int number = 7;
        int temp = 0;
      
        while (temp != number)  {
            temp = 0;             //this reinitializes temp to 0 for each loop
            for(int i = 1; i < number; i++) {
                if ( number % i == 0)   {
                temp = temp + i;
                }
            }  //end of for loop
            if (temp == number) {    
                System.out.println(number + " is a purrrrfect number!!! Yeah this is purrrfect!!!!!");
                break;          // I used the code from above and then used a "break" statement
            }                   //  to break out of the loop
            else    
                number++;
        } //  end of while loop
    }  //end of method nextPerfectNumber  
          
}  //end of class PerfectNumber
