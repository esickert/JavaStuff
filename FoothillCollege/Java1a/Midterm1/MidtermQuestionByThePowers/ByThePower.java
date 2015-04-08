import java.util.Scanner;

public class ByThePower	{
    public static void main(String[] args)	{

    int exponent = 0;
    int base = 0;
     
    Scanner userInput = new Scanner(System.in);
    System.out.print("Please enter a base: ");
    double num1 = userInput.nextDouble(); 
    System.out.print("Please enter an exponent: ");
    double num2 = userInput.nextDouble();

    greyskull(num1, num2);

    } //end of main    YOU ALWAYS FORGET TO CLOSE MAIN WITH ITS OWN BRACKET!!!
   
    public static void greyskull(double base, double exponent)    {

        if (exponent == 0)
            System.out.println(base + " to the power of 0 is 1");
        else if (exponent > 0)  {
            double temp = 1;
            int x = 0;
            while (x < exponent)    {   
                temp = temp * base;
                x++;
            }  //end of while loop
            System.out.println(base + " to the power of " + exponent + " is " + temp);
            }    
        else if (exponent < 0) {
            double temp = 1;
            int x = 0;
            double tempexp = -exponent;
            while (x < tempexp)    {   
                temp = temp * (1 / base);
                x++;
            }  //end of while loop
            System.out.println(base + " to the power of " + exponent + " is " + temp);
            }    
//                System.out.println(Math.pow(base,exponent));  // <---NEED TO DO THIS BY "HAND"!!
                 //end of nested if                                     LOOK IN SECOND ELSEIF
    } //end of greyskull 
             
}  //end of class ByThePower
