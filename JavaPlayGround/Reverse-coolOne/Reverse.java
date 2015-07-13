public class Reverse    {

    private String word;

    Reverse()   {
    }

    Reverse(String newWord)    {
        word = newWord;
    }

    public String setString(String newWord) {
        return word = newWord;
    }

    public String getString()   {
        return word;
    }

    public char[] convertStringToArray(String str)  {
        return str.toCharArray();
    }

    public static void printArray(char[] printArray)    {
        for(int i = 0; i < printArray.length; i++)  {
            System.out.print(printArray[i]);
        }
        System.out.println();
    }

    public static char[] getReverse(char[] cArray)    {
        char[] reverseArray = new char[cArray.length];
        for(int i = cArray.length-1; 0 <= i; i--) {
            reverseArray[cArray.length-1 - i] = cArray[i];
        }
        return reverseArray;
    }
}
        
