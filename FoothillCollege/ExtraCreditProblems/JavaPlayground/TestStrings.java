import java.util.*;

public class TestStrings    {
    public static void main(String[] args)  {
    
        ArrayList<String> myArrayList = new ArrayList<String>();      //how to create and add to an arraylist
        myArrayList.add("hello");  


        String str = "123456789";
        String str2 = "this is a";
        int strLength = str.length();
        int str2Length = str2.length();
//        System.out.println("1) The length of \"" + str + "\" is " + strLength);
//        if (strLength > str2Length)
//            System.out.println("2) \"" + str + "\" is bigger than \"" + str2 + "\"");
 //       System.out.println(str.charAt(2));  //returns i
 //       System.out.println(str.intern());  //returns a "copy" of the string
//        System.out.println(str.toCharArray());
//        System.out.println(str.substring(str.length()));
//        System.out.println(str.substring(str.length() - 3));
//        System.out.println(str.substring(0, 3));
//        String newNum = "," + str.substring(0, 3);
//        System.out.println(newNum);
//        System.out.println(str.concat(newNum));
         String temp = "xxx";;
         int count = str.length();
        System.out.println("str.length is " + count);
         while (count > 2) {
            temp = temp + "," + str.substring(count - 3);
            System.out.println(temp);
            count--;
        } //end of while
 
/*        String s = "It was a bright cold day in April, " +
            "and the clocks were striking thirteen.";
        System.out.println(s);
        int startThirteen = s.indexOf("thirteen");
        int endThirteen = startThirteen + "thirteen".length();
        s = s.substring(0, startThirteen)
            + "twenty-five"
            + s.substring(endThirteen, s.length());
        System.out.println(s); */
        
    }    //end of main
} //end of class TestStrings
