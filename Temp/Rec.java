import java.util.*;

public class Rec    {
    public static void main(String[] args)  {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = userInput.nextInt();
        System.out.println(n); 
        System.out.println("The factorial of "  + n + " is " +factorial(n));
    }

    public static int factorial(int n)  {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
            
}
        
