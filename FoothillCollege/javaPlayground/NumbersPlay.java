public class NumbersPlay	{
    public static void main(String[] args)	{
    
    int x = 2, y = 3;

    if (x > 2)	{
	if (y > 2)	{
	int z = x + y;
	System.out.println ("z is " + z);
	}
    }	
    else
	System.out.println("x is " + x);
    switch (x + x)	{
	case 1: System.out.println("Case 1");
		break;
	case 2:	System.out.println("Case 2 Dude!");
		//break;
	case 3:	System.out.println("Case 3 Mother");
		break;
	default:System.out.println("It's the default Mother!!");
    }
    }	
}
