public class Fibonacci  {
    public static void main (String[] args) {
        int num = 8;

        System.out.println(fib(num));

    } //end of main

    public static int fib(int n)    {
    
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    } //end of fib

}// end of class
