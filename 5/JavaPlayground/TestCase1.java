
public class TestCase1	{

    public static void main(String[] args)	{
	String[] myArray = new String[5];    
        
	printMe(myMethod(myArray));
    
    } //end of main 
   
    public static String[] myMethod(String[] stupid)	{
	
	for(int i = 0; i < stupid.length; i++)	{
	    stupid[i] = "Hello";
	    System.out.print(" " + stupid[i]);
	}  //end of for loop
	System.out.println();
	System.out.println("Inside myMethod");
	return stupid;
    } //end of method myMethod

    public static void printMe(String[] steve)	{	
	for (int i = 0; i < steve.length; i++)	{
	    steve[i] = "Goodbye";
	    System.out.print(steve[i] + " ");
	} //end of for loop
	System.out.println();
	System.out.println("Inside printMe");
    } //end of method steve 
    
    
    
} // end of class TestCase1 
    
