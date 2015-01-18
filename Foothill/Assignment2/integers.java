class integers	{

    public static void main(String[] args)	{
	int x = 3, y = 4, z = 3;
	
	System.out.println("*******************************************");
	calculate(x,y,z);

    }

    public static void calculate(int num1, int num2, int num3)	{
	int temp = 0;

	System.out.println("The sum is " + (num1 + num2 + num3));
	System.out.println("The product is " + (num1 * num2 * num3));
	System.out.println("The average is " + ((float)(num1 + num2 + num3) / 3));

	if ((num1 == num2) && (num2 == num3))    // cheack if all inputs are equal!
	    System.out.println("They are all " + num1 + "'s and equal!!!");
	else    { 
	    if (num1 > num2)	//checking if x greater than y
	        temp = num1;
	    else     
	        temp = num2;
	    if (temp > num3)
		System.out.println(temp + " is the largest");
	    else 
		System.out.println(num3 + " is the largest");
            if (num1 < num2)  //checking if x is less than y
		temp = num1;
	    else    
		temp = num2;
	    if (temp < num3)
		System.out.println(temp + " is the smallest");
		else    { 
		System.out.println(num3 + " is the smallest");
		System.out.println("******************************************");
		}
	}    
	
    }
}
	
