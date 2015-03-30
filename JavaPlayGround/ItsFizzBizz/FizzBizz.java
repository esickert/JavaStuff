public class FizzBizz   {

    public static void main(String[] args)  {

/*    int n = 0;

    while (( n >= 0) && (n <= 100)) {
        if ((n % 3 == 0) && (n % 5 == 0))
            System.out.println("FizzBizz");
        else if (n % 3 == 0)
            System.out.println("Fizz");
        else if (n % 5 == 0)
            System.out.println("Bizz");
        else
            System.out.println(n);
        n++;
        }         */

        for (int i = 1; i<= 100; i++)   {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBizz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Bizz");
            else System.out.println(i);
        } // end of for loop
    } //end of main
} //end of class
