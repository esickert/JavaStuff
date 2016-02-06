public class CellularData   {

    CellularData(int a,int b,int c) {
    }

    public String toString()	{ //a toString method 
    	String anArray = "";
    	for(int i = 0; i < payScaleTable.length; i++)   {
   	  		for(int j = 0; j < payScaleTable[i].length; j++) {
				anArray += (payScaleTable[i][j] + "\t");
        	}
		anArray += "\n";     //"\n" is a new line. This is added at the end of each above for loop.
        }
    }

}
