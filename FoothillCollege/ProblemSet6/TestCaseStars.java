public class TestCaseStars   {
    public static void main(String[] args)  {
    int n = 5;
    int m = 3;
    
    System.out.println(stars(n, m));
//    stars(n);   repeats the output

    }//end of main

    public static String stars(int n, int m)   {
        String p = "";  
        if (n == 0)
            System.out.println();
        else    {
        //    p = p + "*";
        //    p = p + "*";
            p = p + "*";
            p = p + stars(n - 1, m);
            System.out.print(p);
            System.out.println();
            
        } //end else
        return p;
    } //end of stars
    
}//end of class
/*
OUTPUT:
n = 3
*
**
***

n = 4
*
**
***
****

n = 5
*
**
***
****
*****
 
n = 5  and
System.out.println(stars(n));
*
**
***
****
*****
*****

int n = 5; 
    System.out.println(stars(n));
    stars(n);
*
**
***
****
*****
*****

*
**
***
****
*****
  

*/
