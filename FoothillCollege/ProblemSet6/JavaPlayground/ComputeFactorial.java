import java.util.Scanner;

class ComputeFactorial  {
    /** main method  */
    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = userInput.nextInt();   //int not Scanner!! YOU DON'T USE IT; YOU LOSE IT!!!!
        
        //***************************************
        System.out.println("The factorial of " + num + " is " + factorial(num));
        //***************************************
    //    factorial(num);
    
    } // end of main -REMEMBER MAIN IS A SEPARATE METHOD!!!!

    public static int factorial(int n) { 
        if (n == 0)
            return 1;
        else    { 
            System.out.println ("I'm here " + n);
            return n * factorial(n-1);
        }
    
    } // end of method factorial



} // end of class
