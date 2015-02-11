import java.util.*;

public class TestCase1	{

    public static void main(int[] args)	{
	int[] myArray = new int[10];    
        
	printMe(myMethod(myArray));
    
    } //end of main 
   
    public static int[] myMethod(int[] stupid)	{
	Scanner userInput = new Scanner(System.in);
	System.out.print("Please enter a number: ");

	for(int i = 0; i < 5; i++)	{
	    stupid[i] = i;
	    System.out.print(" " + stupid[i]);
	}  //end of for loop
	System.out.println();
	System.out.println("Inside myMethod");
	return stupid;
    } //end of method myMethod

    public static void printMe(int[] steve)	{	
	for (int i = 0; i < 10; i++)	{
	    steve[i] = i;
	    System.out.print(steve[i] + " ");
	} //end of for loop
	System.out.println();
	System.out.println("Inside printMe");
    } //end of method steve 
    
    
    
} // end of class TestCase1 
    
