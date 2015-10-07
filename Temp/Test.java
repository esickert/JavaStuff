public class Test   {
    public static void main(String[] args)  {
        String str = "hi";
        if (str.length() < 3)
            System.out.println(str.toUpperCase());
        else    {
            String str2 = (str.substring(str.length()-3,str.length()));
            System.out.println(str2.toUpperCase());
        }
    System.out.println();
    }
}
