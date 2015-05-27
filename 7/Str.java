public class Str    {

    private String ex1;

    public Str()    {
    }


//    public Str()    {
//        this("hello");
//    }

    public void setString(String str)    {
        ex1 = str;
    }

    public String getString()   {
        return ex1;
    }

    public int indexAt(char ch)   {
        return ex1.indexOf(ch);
    }

    public int lastIndexAt(char ch)    {
        return ex1.lastIndexOf(ch);
    }

    public char[] convertStringToArray(String word)   {
        return word.toCharArray();
    }

}
    
