/** Tests class CellularData by creating one object from it and 
  * calling methods on it.
  */
public class TestCellularData {
    public static void main(String[] args) {
        System.out.println("Part 1 with Partial Data:");
        final double[] canadaPartial = {0,0,0.05,0.23,0.37,0.75,1.26};
        final double[] mexicoPartial = {0,0,0,0,0,0,0.01};
        final double[] usaPartial = {0,0,0.14,0.28,0.5,0.83,1.39};

        int startingYear = 1983;
        CellularData datatable;
        int numRows = 3;
        int numColumns = canadaPartial.length;

        datatable = new CellularData(numRows, numColumns, startingYear);
//        datatable.addCountry("canada", canadaPartial);
//        datatable.addCountry("mexico", mexicoPartial);
//        datatable.addCountry("usa", usaPartial);
                  
        System.out.println(datatable);
        // Note: The output of your table may be different as long as it's readable
        // canada        0    0    0.05    0.23    0.37    0.75    1.26    
        // mexico        0    0    0       0       0       0       0.01    
        // usa           0    0    0.14    0.28    0.50    0.83    1.39

 

//        System.out.printf("usa (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("usa",1983,1989));
        // country is "usa", subscriptions from 1983 to 1989
        // the output is: 
        // usa (1983 to 1989): 3.14

//        System.out.printf("mexico (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("mexico",1983,1989));
        // country is "mexico", subscriptions from 1960 to 2000
        // the output is:
        // mexico (1983 to 1989): 0.01                  
        // NOTE: in order to get this result, you must test beyond the sample data included here and refer to the CSV file.

//        System.out.printf("canada (1890 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("canada",1890, 2000));
        // the output is:
        // ERROR : requested year 1890  is less than starting year 1893
        // canada (1890 to 2000): -1.00 

                  
        // Part 2
        System.out.println("\n\nPart 2 with All Data:");
        final double[] canada = {/* refer to the CSV file */};
        final double[] mexico = {/* refer to the CSV file */};
        final double[] usa = {/* refer to the CSV file */};

        startingYear = 1960;
        numRows = 3;
        numColumns = canada.length;
        
        datatable = new CellularData(numRows, numColumns, startingYear);
       
//        datatable.addCountry("canada", canada);
//        datatable.addCountry("mexico", mexico);
//        datatable.addCountry("usa", usa);

        System.out.println(datatable);
        // The output of your table. 

//        System.out.printf("usa (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("usa",1983,1989));
        // country is "usa", subscriptions from 1983 to 1989
        // the output is same as Part 1

//        System.out.printf("mexico (1960 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("mexico",1960,2000));
        // country is "mexico", subscriptions from 1960 to 2000
        // the output is: 
        // mexico (1960 to 2000): 29.62
        
//        System.out.printf("canada (1890 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("canada",1890, 2000));
        // testing out-of-bounds data
        // the output is same as Part 1
         }
} 

 

/**Testing:

    Add at least two test cases beyond those provided.

    For example: Make sure your implementation can handle more than 3 countries.
    Try modifying the output when the range of years provided is invalid.
    Currently the output is -1.00, which is not user friendly.  One way is to
    modify the test file to provide a more user friendly output for all cases
    where the requested data does not exist.

    toString method to printout 2D array

    public String toString()	{ //a toString method 
    	String anArray = "";
    	for(int i = 0; i < payScaleTable.length; i++)   {
   	  		for(int j = 0; j < payScaleTable[i].length; j++) {
				anArray += (payScaleTable[i][j] + "\t");
        	}
		anArray += "\n";     //"\n" is a new line. This is added at the end of each above for loop.
        }
    }
*/
