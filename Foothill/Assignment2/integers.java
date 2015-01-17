class integers	{

    public static void main(String[] args)	{
	int x = 2, y = 3, z = 2;
	numbers(x,y,z);
	smallest(x,y,z);
	largest(x,y,z);
    }

    public static void numbers(int x, int y, int z)	{
	int sum = (x + y + z);
	int product = (x * y * z);
	double average = ((double)sum / 3);
	System.out.println("The sum is " + sum);
	System.out.println("The product is " + product);
	System.out.println("The average is " + average);

    }
    public static void smallest(int x, int y, int z)	{
	int temp = 0;
	//WHAT IF THEY ARE EQUAL SHIT!!!!  OR IS THAT IMPORTANT
	if (x < y)	{
	    temp = x;
	   // System.out.println(temp);
	}
	else temp = y;
	if (temp < z)
	    System.out.println(temp + " is the smallest");
	else System.out.println(z + " is the smallest");
    }
    public static void largest(int x, int y, int z)	{
	int temp = 0;
	//WHAT IF THEY ARE EQUAL SHIT!!!! OR IS THAT IMPORTANT
	if (x > y)	{
	    temp = x;
	   // System.out.println(temp);
	}
	else temp = y;
	if (temp > z)
	    System.out.println(temp + " is the largest");
	else System.out.println(z + " is the largest");
    }
    
}
	
