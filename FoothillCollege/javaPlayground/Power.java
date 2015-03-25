public class Power    {   

    public static void main(String[] args)  {
    int base = 2;
    int exp = 33;

    System.out.println(pow(base, exp));

    }

    public static long pow(int base, int exp)    {
    
    if (exp == 0)
        return 1;
    else
        return base * pow(base, exp-1);
    } //end of Pow
} //end of class
