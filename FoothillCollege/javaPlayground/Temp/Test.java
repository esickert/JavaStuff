public class Foo    {
    static int i = 0;
    static int j = 0;

    public static void main(String[] args)  {
        int i = 2;
        int j = 3;
        
        {
            int j = 4;
            System.out.println("i + j is " + i + j);
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    
    } //end of main
} //end of class
    

        
