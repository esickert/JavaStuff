import java.util.*;

public class TestMethodOverload	{
    public static void main(String[] args)	{
    
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int x = userInput.nextInt();
    System.out.print("And again...another integer: ");
    int y = userInput.nextInt();

    System.out.print("Please enter a double: ");
    double a = userInput.nextDouble();
    System.out.print("And another.... ");
    double b = userInput.nextDouble();
    System.out.print("And one more...double: ");
    double c = userInput.nextDouble();

    System.out.println("The maximnum between " + x
                + " and " + y + " is " + max(x,y));
    System.out.println("The maximum between " + a + " and " + b + " and "
                + c + " is " + max(a, b, c));
    System.out.println("The maximum between " +  a + " and " + b + " is " + max(a, b));
    } // end of main

    public static int max(int x, int y){
        int result;

        if (x > y)
            result = x;
        else result = y;
        return result;
    
    } //end of method max(x,y)

    public static double max(double a, double b, double c)  {
        double result;
        if (a > b)
            result = a;
        else if ( b > c)
            result = b;  
        else result = c;
        return result;

    } //end of max(a,b,c)

    public static double max(double a, double b)    {
        double result;
        if (a > b)
            result = a;
        else result = b;
        return result;

    }  //end of max(a,b)
} //end of class TestMethodOverload
