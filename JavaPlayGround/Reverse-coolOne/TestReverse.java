public class TestReverse   {
    public static void main(String[] args)    {

        String str = "Reverse this string and more!";
        char[] bArray = str.toCharArray();

/*        printArray(bArray);
        char[] reverse = printReverse(bArray);
        printArray(reverse);
*/
        Reverse newGuy;
        newGuy = new Reverse(str);
        System.out.println("string to be reversed: " + newGuy.getString());
        newGuy.setString(str);
        System.out.println("from stackoverflow website:   " + new StringBuilder(str).reverse().toString());
        System.out.println("My solution:  ");
        newGuy.printArray(newGuy.getReverse(newGuy.convertStringToArray(newGuy.getString())));

    }  //end of main                   main is a separate method!! !!!!!

/*    public static void printArray(char[] printArray)    {
        for(int i = 0; i < printArray.length; i++)  {
            System.out.print(printArray[i]);
        }
        System.out.println();
    }

    public static char[] printReverse(char[] cArray)    {
        char[] reverseArray = new char[cArray.length];
        for(int i = cArray.length-1; 0 <= i; i--) {
            reverseArray[cArray.length-1 - i] = cArray[i];
        }
        return reverseArray;
    }
*/       
    
}    

    
    

