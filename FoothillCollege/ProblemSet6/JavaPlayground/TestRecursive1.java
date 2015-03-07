public class TestRecursive1 {
    public static void main(String[] args)  {

        int n = 3;
//        int m = 5;
        printStars(n);

    } // end of main

    public static String printStars(int n)    {
    String p = "";
    while (n <= 5){
        p = "";
        if (n == 0)  {
            System.out.println();
        } else if (n == 1)   {
            //p = printStars((n - 1));
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 2)    {
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
    //        printStars(2);      this is wrong
        }else if (n == 3)   {   
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println(); 
//            printStars(3);        this is wrong
        }else if (n == 4)   {   
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 5)   {
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        } 
       n++;

    }
//    System.out.println("I can't figure this fucking out!!");
//    m = 3;
    n = 5;
    while ( 3 <= n){
        p = "";
        if (n == 0)  {
            System.out.println();
        } else if (n == 1)   {
            //p = printStars((n - 1));
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 2)    {
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 3)   {   
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 4)   {   
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        }else if (n == 5)   {
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            p = p + "*";
            System.out.print(p);
            System.out.println();
        } 
        n--;

    }   
        return p;    //this is for the recursive call!!!
    } //end of printStars
    
   
} // end of class
