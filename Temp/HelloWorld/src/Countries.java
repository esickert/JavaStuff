
public class Countries {
	
	static String helloMsg;
	int[] stuff = new int[10];
	
	public Countries()	{
		
	}
	
	public Countries(String a)	{
		helloMsg = a;		
	}
	
	public void printMe()	{
		System.out.println(helloMsg);
	}
	
	public void multiplePrints(String b, int c) {
		for(int i = 0; i <= c; i++)	{
			System.out.print(" " + b);
		}
		System.out.println();
	}
	
	public void printMessages(char a)	{
		switch (a)	{
			case '1':
				System.out.println("this is inside a switch statement-1");
				break;
			case '2':
				System.out.println("switch stateent-case 2");
				break;
			case '3':
				System.out.println("switch statement-Line 3");
				break;
			case '4':
				System.out.println("switch statement-This is case 4");
				break;
			default:
				System.out.println("switch statement-This is default!!!!!");
		} //end of switch
	}
		
	public void putString(String a)	{
		helloMsg = a;
	}
	
	public String getString()	{
		return helloMsg;
	}

}
