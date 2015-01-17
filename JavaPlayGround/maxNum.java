class maxNum	{
    public static void main(String[] args)	{
	max(false,true,false);

    public static void max(boolen a, boolean b, boolean c)	{
	System.out.println( a && b || b && c || a && c);
    }
    }
}
