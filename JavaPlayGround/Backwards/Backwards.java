public class Backwards    {

    public static void main(String[] args)  {
        String str = "mississippi";

        char[] word = str.toCharArray();
        char[] drow = new char[word.length];  //don't forget that index starts at 0

        for (int i = 0; i < word.length; i++)   {  // str.length() -1 because index starts at 0!
                drow[i] = word[(word.length -1)-i];
        }

        for ( int i = 0; i <= drow.length -1; i++) {
            System.out.print(drow[i]); //        
 
        }
        System.out.println();
        String reverse = new String(drow);
        System.out.println(reverse);
        if (str.equals(reverse))
            System.out.println(reverse + " is a palidrone of " + str);
        else 
            System.out.println(reverse + " is NOT a palidrone of " + str);

    } // end of main
} // end of class
