import java.util.Scanner;

public class BookReviewQues1Chap3	{
    public static void main(String[] args)	{
    int num2 = 2, num3 = 2;

    Scanner userInput = new Scanner(System.in);
    //prompt user for input
    System.out.print("Please enter a numer: ");
    int input = userInput.nextInt();
    
    if (input == 0)
	System.out.println("0 is neaither even or odd!!! Shithead!!");
    else if ((input % 2) == 0)
	System.out.println(input + " is even");
    else System.out.println("The number you entered is odd!!! Fuckface.");

    //this is a question from the book chapter review questions. 
    System.out.println(num2 += num2 + num3);
    }
}
