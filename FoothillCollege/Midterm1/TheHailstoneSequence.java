import java.util.*;

public class TheHailstoneSequence	{
    public static void main(String[] args)	{
    
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a positve number: ");
        int inputNumber = userInput.nextInt();
        
        collatzConjecture(inputNumber);

    } //end of main

    public static void collatzConjecture(int number)  {
        int count = 0;
        if (number <= 1)        
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
    
