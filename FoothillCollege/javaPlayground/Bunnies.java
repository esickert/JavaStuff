public class Bunnies    {
    public static void main(String[] args)  {
    int num = 3; 
    System.out.println(ears(num));

    }

    public static int ears(int n)  {
        if (n == 0) 
            return 0;
        else return 2 + ears(n - 1);
            
    }
}
