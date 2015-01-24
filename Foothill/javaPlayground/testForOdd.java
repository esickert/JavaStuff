public class testForOdd	{
	public static void main(String[] args)	{
		boolean dog = true;
		boolean cat = false;
		boolean mouse = true;
		int count = 0;
		
		if (dog == true)
			count++;
		if (cat == true)
			count++;
		if (mouse == true)
			count++;
		System.out.println(count);
		if ((count == 1) || (count == 3))
			System.out.println("TRUE");
		else System.out.println("FALSE");
	}
}
	
