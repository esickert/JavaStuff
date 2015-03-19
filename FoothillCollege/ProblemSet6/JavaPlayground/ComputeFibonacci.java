public class ComputeFibonacci    {
    public static void main(String[] args)  {
    long index = 12;
    
    System.out.println(fib(index));
    
    } //end of main

    public static long fib(long index) {

    if (index == 0)
        return 0;   
    else if (index == 1)
        return  1;
    else 
        return fib(index - 1) + fib (index - 2);

    } // end of fib
} //end of class
