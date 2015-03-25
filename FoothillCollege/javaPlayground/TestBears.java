public class TestBears  {

    public static void main(String[] args)  {
        int n = 250;
        bears(n);

    }// end of main

    public static void bears(int n)   {
        
        if (n == 42)
            System.out.print("true");
        else if (n < 42)
            System.out.println("false");
        else    {       
        bears(n / 2); 
        bears(n - 42);
//        bears(n - ((n % 10) * ((n % 100) / 10)));
        }
        
        
        

    } // end of bears

} // end of class
    
