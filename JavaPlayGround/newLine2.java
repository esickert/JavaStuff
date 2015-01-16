class newLine2	{
    //these variables are now global??
    //so this is now all screwed up
    String a = "Hello rethere!!!!";
    String b = "I'm back!!!!";
//    String s = "";

    public static void main(String[] args)	{
    
    threeLine(a);
    threeLine(b);
    }

    static void threeLine(String s)	{
	System.out.println(s);
	System.out.println(s + s);
	System.out.println(s + s + s);
    }
}	
