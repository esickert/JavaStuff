public class Compare    {
    
    public static void main(String[] args)  {

    String a = "not wonder";
    String b = a.substring(0,1);
    System.out.println( b);
    b = a.substring(a.length() - 1, a.length());
    System.out.println(a.substring(a.length() - 1, a.length()) + a.substring(1, a.length() - 2)
        + a.substring(0,1));
    System.out.println(a.substring(0,3).equals("not"));
    if (a.substring(0,3).equals("not"))
        System.out.println(a);
    else System.out.println("not " + a);

    }// end of main
} // end of class
