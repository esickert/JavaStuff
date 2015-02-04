import java.util.*;

public class ReverseNum	{
    public static void main(String[] args)	{

//  System.out.println(0 % 10);
    int n;
    int reverse = 0;

    System .out.print("Enter the number to reverse: ");
    
    Scanner userInput = new Scanner(System.in);
    n = userInput.nextInt();
    int number = n;
    int count = 1;

    while (n != 0)  {
        reverse = reverse * 10;
        System.out.println("In pass " + count + " reverse is " + reverse);
        reverse = reverse + n % 10;
        System.out.println("reverse is then " + reverse);
        n = n / 10;
        System.out.println("In pass " + count + ",n is " + n);
        count++;
       // break;
    } // end of while loop

    System.out.println("The reverse of " + number + " is " + reverse);

    } //end of main
} //end of class ReversNum

