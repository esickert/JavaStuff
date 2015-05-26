import java.io.*;

public class TestStrings{
    public static void main(String args[]){
        String Str1 = new String("Welcome to Tutorialspoint.com");
        String Str2 = new String("WELCOME TO TORIALSPOINT.COM");
        String Str3 = new String("Welcome to Tutorialspoint.comm");

        System.out.print("Canonical representation:" );
        System.out.println(Str1.intern());

        System.out.print("Canonical representation:" );
        System.out.println(Str2.intern());
        System.out.println(Str3.intern());

        System.out.println(Str1.intern() == Str2.intern());
        System.out.println(Str1.intern() == Str3.intern());
        System.out.println("Line 17");
        System.out.println(Str1.intern() == Str2.intern());

        System.out.println(Str1 + Str2 + Str3);
        
        System.out.println(Str1.substring(0, 5)); //note this does not include the 5th place!!!
        System.out.println(Str1.substring(5));
        System.out.println(Str1.substring(0, 5) + " :-) " + Str1.substring(5));

        System.out.println(Str1.equals(Str2));
        System.out.println(Str1.compareTo(Str3));
        System.out.println(Str1.equalsIgnoreCase(Str2));
        System.out.println(Str1.regionMatches(2, Str2, 0, 1));   //This is a little confusing,
                                                                 // there are 2 versions of this

        System.out.println(Str1.replace('e','Z'));
        System.out.println(Str1.replace("e","ZZZZZZ"));
        
   }
}

