import java.util.*;
/** class PayScaleTable
 * 
 * @author esickert
 *
 */
public class PayScaleTable  {
   
    double[][] payScaleTable; 

    PayScaleTable() {    //this is a constructor 
    }
    
    PayScaleTable(double[][] a)   {  //this is a constructor
        payScaleTable = a;
    }
    
    public double rate(int a, int b)    {
        return payScaleTable[a][b];
    }

    public String convertArrayToString(double[][] a)  {
        String stuff1 = Arrays.deepToString(a);
        return stuff1;
    }
    
/** 
 * print2DArray was my first attempt to printout the 2D array   
 * @param a
 */
    public void print2DArray(double[][] a)    {
        for(int i = 0; i < a.length; i++)   {
//            System.out.println();
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     *  toString method to print out the 2-D array using just System.out.println()
    */
    public String toString()	{ //a toString method 
    	String anArray = "";
    	for(int i = 0; i < payScaleTable.length; i++)   {
   	  		for(int j = 0; j < payScaleTable[i].length; j++) {
				anArray += (payScaleTable[i][j] + "\t");
        	}
			anArray += "\n";   //this drops to new line after each line    
        }
        return anArray;    
    } 
}
    

