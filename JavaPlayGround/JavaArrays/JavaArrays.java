import java.util.*;

public class JavaArrays   {

    private String[] myArray;
    private String[][] my2DArray;
    
    //static String toString()

    JavaArrays(String[] x)    {
        myArray = x;
    }

    JavaArrays(String[][] temp)   {
        my2DArray = temp;
    }

    public void printString(int[] temp) {
        System.out.println(Arrays.toString(temp));
    }
    
    public void loadArray(String x)  {   //null pointer exception- no array length being set!!
        for(int i = 0; i <= my2DArray.length -1; i++) {
            for(int j = 0; j <= my2DArray[i].length - 1; j++)
                my2DArray[i][j] = x;
        }
    }
    
    public void printArray()    {
        for(int i = 0; i <= my2DArray.length - 1; i++)    {
            System.out.println();
            for (int j = 0; j <= my2DArray[i].length - 1; j++)
                System.out.print(my2DArray[i][j]);
        }
        System.out.println();
    }
    
//    public void 
    
}
