/*public class TestCases  {
    public static void main(String[] args)     {

    String str = "this is atest";
    String subStr= str.substring(7);
    String subStr2 = str.substring(7,10);
    System.out.println(str.indexOf("this"));
    System.out.println(subStr);
    System.out.println(subStr2);  */

import java.io.*;

public class TestCases{
   public static void main(String args[]){
 /*       String Str = new String("Welcome to Tutorialspoint.com");
        char[] myArrayStuff =  Str.toCharArray();
       System.out.println(myArrayStuff);*/


      String Str = new String("Welcome toaTutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10, 15) );



    } // end of main
}//end of class
