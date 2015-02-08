/***********************************************************************/
// Problem Set 3                                          Erich Sickert
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
			"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
			"Aaron", "Kate"};

	int[] times = {341, 273, 278, 329, 445, 403, 388, 275, 243, 334, 412, 393, 299,
		      343, 317, 265};

	System.out.println("Name:\t Time:");              // tabs used to format output
	System.out.println("***************");
	for (int i = 0; i < names.length; i++) {          
	    System.out.println(names[i] + ":\t " + times[i]);
        } // end of for loop

	int bestTimeIndex = bestRunningTime(times);       // newline used to format output
	System.out.println("\n" + names[bestTimeIndex] + " had the best running time of "
			   + times[bestTimeIndex]);
	int timeIndexSecondBest = secondBestTime(times);
	System.out.println(names[timeIndexSecondBest] + " had the second best "
	    + "running time of " + times[timeIndexSecondBest] + "\n");             

    } //end of main

/** bestRunningTime returns the index of the best running time frome the array times[]  */
    public static int bestRunningTime(int[] runningTimes)	{
    	int temp = 500;                            //THInK ABOUT THIS ????????????  500????
	int timesIndex = 0;                        
	for (int i = 0; i < runningTimes.length; i++)	{
	    if (runningTimes[i] < temp)	{                                 
		temp = runningTimes[i];
		timesIndex = i;
	    } //end of if
	} //end of for loop
	return timesIndex;      			  //returns the index of the lowest time in the parameter array
    } //end of method bestRunningTime

/** secondBestTime returns the index of the second best time in the array times[] */ 
    public static int secondBestTime(int[] runTimes)	{ 
     	int indexBestRun = bestRunningTime(runTimes);     //bestRunningTime is called to get the index of the lowest running time.
	int temp =  500;                //THInK ABOUT THIS ????????????  500????
	int secondBestTimeIndex = 0;
	for (int i = 0; i < runTimes.length; i++)	{ //for loop is used to cycle thru all values of the array
	    if (runTimes[i] == runTimes[indexBestRun])	  //if a value in array equals lowest value it is skipped               
	        continue;
	    else	{
		if (runTimes[i] < temp)	{                 //values are then compared to one another until the next lowest is found 
		    temp = runTimes[i];
		    secondBestTimeIndex = i;
		} //end of if
	    } //end of else
	} //end of for loop
	return (secondBestTimeIndex);                     // returns the index of the second lowest time in the array
    } //end of method secondBestTime

} //end of class Marathon


/*OUTPUT:

Name:		 Time:
*********************
Elena:		 341
Thomas:		 273
Hamilton:		 278
Suzie:		 329
Phil:		 445
Matt:		 403
Alex:		 388
Emma:		 275
John:		 243
James:		 334
Jane:		 412
Emily:		 393
Daniel:		 299
Neda:		 343
Aaron:		 317
Kate:		 265

John had the best running time of 243
Kate had the second best running time of 265
*/


