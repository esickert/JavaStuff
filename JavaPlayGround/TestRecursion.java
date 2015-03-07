public class TestRecursion      {
    public static void main(String[] args)  {
    int n = 2;
    
    recursiveTest(n);   

    }//end of main

    public static void recursiveTest(int n)  {   
        int m = 1;
        if (n == 0) {      // always forget the pararentheses FUCKFACE!!!!  and the == sign
            System.out.print("*");
            System.out.println();
        } //end of if
        else    {
            System.out.print("*");
            recursiveTest(m * n - 1);
            recursiveTest(n - 1);
        }  // end of else
    }// end of method
        





}//end of class


