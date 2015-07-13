public class Str    {

    private static String ex1;

    public Str()    {
        this("hello world- this is being set by this"); //"this" is weird, not sure what's going on here!!
    }

    public Str(String str)  {
        ex1 = str;
    }
    
    public void setString(String str)    {
        ex1 = str;
    }

    public String getString()   {
        return ex1;
    }

    //using String class indexOf
    public int indexAt(char ch)   {
        return ex1.indexOf(ch);
    }

    //using String class lastIndexOf
    public int lastIndexAt(char ch)    {
        return ex1.lastIndexOf(ch);
    }

    public char[] convertStringToArray(String word)   {
        return word.toCharArray();
    }

    public String convertArrayToString(char[] ch)   {
        String str = new String(ch);
        return str;
    }

    public String convertArray(char[] ch) {
        String str = String.valueOf(ch);
        return str;
    }

    public char[] reverseArray(char[] words)  {
        char[] temp = new char[words.length];
        for (int i = words.length-1 ; 0 <= i; i--)  {
            temp[(words.length - 1)- i] = words[i];
        }
        return temp;
    }

    public boolean isPalindrome(String a, String b)   {
        return a.equals(b);
      }

    public int countNumberOfCharacters(char[] chArray, char ch) {
        int count = 0;
        for(int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ch)    //you always forget your parentheses!!!!!!!
                count++;
        }
        return count;
    }
    
}
    
