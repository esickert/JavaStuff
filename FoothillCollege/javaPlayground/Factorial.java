import java.util.*;

public class Factorial  {  
    
    public static void main(String[] args)  {   
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int num = userInput.nextInt();
        System.out.println("The factorial of " + num + " is " + theFact(num));
        
    } // end of main

    static int theFact(int n)   {   

        if (n == 0)
            return 1;
        else
            return n * theFact(n-1);

    }  //end of theFact
} //end of class
    
    
