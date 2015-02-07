public class Marathon	{
    public static void main(String[] args)	{

	String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
			"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
			"Aaron", "Kate"};

	int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 293, 334, 412, 393, 299,
		      343, 317, 265};

	int timeIndex = bestRunningTime(times);
	System.out.println(names[timeIndex] + " had the best time of " + times[timeIndex]);
	int timeIndexSecondBest = secondBestTime(times);
	System.out.println("Inside main, secondBestTime method index is " + timeIndexSecondBest);

    } //end of main

    public static int bestRunningTime(int[] x)	{

	int temp = 500;
	int i = 0, j = 0;
	for (i = 0; i < x.length; i++)	{
	    if (x[i] < temp)	{                  //temp as an array is going out of bounds as it only had one element.
		temp = x[i];
		j = i;
	    } //end of if
	} //end of for loop
	return j;
    } //end of method bestRunningTime

    public static int secondBestTime(int[] y)	{ 

	int z = bestRunningTime(y);
	System.out.println("Inside secondBestTime method, array index " + z);
	return (z);
    } //end of method secondBestTime

} //end of class Marathon
