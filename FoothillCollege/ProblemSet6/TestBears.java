public class TestBears    {    //don't forget class
    /** main method */
    public static void main(String[] args)  {       
        int n = 250;
        System.out.println(bears(n));

    } // end of main

    public static boolean bears(int n)  {

        if (n == 42)    {
            System.out.println("I'm here!! true");
            return true;
        }
        else if ((n % 2) == 0)    {
                n = n / 2;
                System.out.println(n + " I'm inside divided by 2");
                return bears(n);
            } //end of if  */
        else if ((n % 4) == 0 || (n % 3) == 0)  { 
                n = n - ((n % 10) * ((n % 100) / 10));                                    //THIS GUY IS BLOWING UP ON ME
                System.out.println(n - (n - (n % 10) * ((n % 100) / 10)) + " Line 21");
                System.out.println(((n % 10) * ((n % 100) / 10)) + " Line 22");
                System.out.println(n + " I'm inside divide by 4 or 3");
                return bears(n-1);
            }
        else if ((n % 5) == 0)  {
            System.out.println(n + " I'm inside divided by 5");
            n = n - 42;
            System.out.println(n);
            return bears(n);
            }
            else    {
                System.out.println(n + " I'm at the bottom!");
                return false;
            }
    } // end of method bears

} // end of class TestBears


 
