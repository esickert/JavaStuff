/***********************************************************************/
/** Problem Set 3                                          Erich Sickert
//
// Write a method that takes as input an array of integers and returns the
// index corresponding to the lowest one. Run this method on the array of
// times. Print out the name and time corresponding to the returned index. 
//
// OPTIONAL: Write a second method to find the second-best runner. 
// The second method should use the first method to determine the best
// runner, and then loop through all values to find the second-best
// (second lowest) time.
/***********************************************************************/
public class Marathon	{

    /**  main method  */
    public static void main(String[] args)	{

	String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
			"Emma", "John", "James", "Jane", "Emily", "Daniel",
			"Neda", "Aaron", "Kate"};

	int[] times = {341, 473, 278, 329, 445, 403, 388, 275, 243, 334,
		       412, 393, 299, 343, 317, 265};

	System.out.println("Name:\t\tTime:"); // tabs and newlines used to format output
	System.out.println("*********************");
	for (int i = 0; i < names.length; i++) { 
	    System.out.println(names[i] + ":\t\t" + times[i] + " minutes");
        } // end of for loop

	System.out.println("\n" + names[bestRunningTime(times)] + " had the best "
	    + "running time of " + times[bestRunningTime(times)] + " minutes.");
	System.out.println(names[secondBestTime(times)] + " had the second best "
	    + "running time of " + times[secondBestTime(times)] + " minutes.\n");             

    } //end of main

/***********************************************************************/
/** method bestRunningTime() returns the index of the lowest
/*  running time from the array times[]  
/***********************************************************************/
    public static int bestRunningTime(int[] runningTimes)	{
    	int temp = runningTimes[0];                           
	int lowestTimeIndex = 0;                        
	for (int i = 0; i < runningTimes.length; i++)	{ 
	    if (runningTimes[i] < temp)	{                                 
		temp = runningTimes[i];
		lowestTimeIndex = i;                           
	    } //end of if
	} //end of for loop
	return lowestTimeIndex;      //return the index of the lowest time  
    } //end of method bestRunningTime

/***********************************************************************/
/** secondBestTime() returns the index of the second lowest running
/*  time in the array times[]. It makes a call to bestRunningTime() 
/*  to return the index of the lowest running time which it then uses
/*  to compare and find the second lowest running time. That value (index)
/*  is then returned.
/***********************************************************************/
    public static int secondBestTime(int[] runTimes)	{ 
	int temp =  runTimes[0];                
	int secondLowestTimeIndex = 0;
	for (int i = 0; i < runTimes.length; i++)	{
	    if (runTimes[i] == runTimes[bestRunningTime(runTimes)])	                 
	        continue;    // calls bestRunningTime(). If equal, skips.
	    else	{
		if (runTimes[i] < temp)	{                 
		    temp = runTimes[i];
		    secondLowestTimeIndex = i;              
		} //end of if
	    } //end of else
	} //end of for loop
	return (secondLowestTimeIndex); //return index of second lowest time                    
    } //end of method secondBestTime

} //end of class Marathon





