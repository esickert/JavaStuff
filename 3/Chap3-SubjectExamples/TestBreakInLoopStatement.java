public class TestBreakInLoopStatement	{
    public static void main(String args[])	{
	int sum = 0,i ,j;
	int number = 0;

	while (number < 20)	{
	    number++;
	    System.out.print(number);
	    sum += number;
	    if (sum >= 100)
//  "break" will leave the loop completely!
//  "continue" will NOT leave the loop but only the current interation. 
//  The output is below for each
		//break;
		continue;
	}

        System.out.println("\nThe number is " + number);
	System.out.println("The sum is " + sum);
    }
}



//For "break" outbut is
//1234567891011121314
//The number is 14
//The sum is 105

//For "continue" output is
//1234567891011121314151617181920
//The number is 20
//The sum is 210



