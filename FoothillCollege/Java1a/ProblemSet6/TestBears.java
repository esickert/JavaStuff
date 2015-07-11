/***********************************************************************
/*  Assignment 6.1 Bears-ugh!!!                         Erich Sickert
/*                                                      
/* Okay this program does compile and run but it is not correct. It 
/* checks linearly each of the constaints one after the other which I
/* know is not correct (see the description below). I can't get my head
/* around recursion. 
/***********************************************************************


import java.util.*;

public class TestBears    {    
    /** main method */
    public static void main(String[] args)  {       
        
    Scanner userInput = new Scanner(System.in);
    System.out.print("Please enter the number of bears: ");
    int num = userInput.nextInt(); */

    System.out.println(bears(num));

    } // end of main

    public static boolean bears(int n)  {

        if (n == 42)    {    // base case
            System.out.println("I'm here at 42!! true");
            return true;
        }
<<<<<<< HEAD
        else if (((n % 2) == 0) )    {
                n = n / 2;
                System.out.println(n + " I'm inside divided by 2");
                return bears(n);
            } //end of if  */
        else if ((n % 4) == 0 || (n % 3) == 0)  { 
                n = n - ((n % 10) * ((n % 100) / 10));                                    //THIS GUY IS BLOWING UP ON ME
//                System.out.println(n - (n - (n % 10) * ((n % 100) / 10)) + " Line 21");
//                System.out.println(((n % 10) * ((n % 100) / 10)) + " Line 22");
                System.out.println(n + " I'm inside divide by 4 or 3");
                return bears(n);
            }
        else if ((n % 5) == 0)  {
=======
        else if ((n % 5) == 0)
            {
>>>>>>> 73b270b04c14e81482b8d79160c73e1e1b7ed979
            System.out.println(n + " I'm inside divided by 5");
            if (n < 42)
                return false;
            System.out.println(n);
            return bears(n - 42);
/***********************************************************************
/* Soo... I know this is not correct but the code below is what I think
/* is the solution or something like it. The method is called recursively
/* on all three variations and attempts to return a boolean value. The
/* "or" statements will return a true if only one of the statements is
/* true. This doesn't work... java wigs out. I am having alot of problems
/* getting my head around recursion. Even the "stars" problem... 
/***********************************************************************/
//      return (bears(n - 42) || bears(n / 2)) || bears(n - ((n % 10) * ((n % 100) / 10)))
            }
        else if ((n % 2) == 0)    {
                System.out.println(n + " I'm inside divided by 2");
                return bears(n / 2);
            } //end of if  
        else if ((n % 4) == 0 || (n % 3) == 0)  { 
                System.out.println(n + " I'm inside divide by 4 or 3");
                return bears(n - ((n % 10) * ((n % 100) / 10)));
            }  
        else    {
                System.out.println(n + " I'm at the bottom!");
                return false;
            }          
    } // end of method bears

} // end of class TestBears


 
