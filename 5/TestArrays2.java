import java.util.Scanner;

public class TestArrays2	{
    public static void main(String[] args)	{

	int[] numArray = new int[6];
	Scanner userInput = new Scanner(System.in);
    
	for (int i = 0; i < numArray.length; i++)	{
	    System.out.print("Please enter a number: ");
	    numArray[i] = userInput.nextInt(); // forgot the parentheses shit!!!
	} //end of for loop

        int number = numArray[0];
	for (int i = 0; i < numArray.length; ++i)	{	
	    if (numArray[i] > number)
		number = numArray[i];
        } // end of for loop
	System.out.println(number + " is the largest!");
        int count = 0;
	for (int i = 0; i < numArray.length; i++)	{
	    if (number == numArray[i])
		count++;	
	} //end of for loop
	System.out.println("There are " + count + " instances of " + number);

    } //end of main
} //end of class TestArrays2
