import java.util.*;

public class ArrayToString  {
    
    double[] myArray = new double[5];
    double[][] myOtherArray = new double[2][3];

    ArrayToString() {
    }
    
    ArrayToString(double[] a)   {
        myArray = a;
    }
    
//    String toString   

    public void print1DArray(double[] a)    {
        for(int i = 0; i < a.length; i++)   {
            System.out.print(a[i] + "    ");
        }
    }


    public void print2DArray(double[][] a)  {  
        for(int i = 0; i < a.length; i ++)  {
            System.out.println();
            for(int j = 0; j < a[i].length; j++)    {
                System.out.print(a[i][j] + "   ");
            }
        System.out.println();
        }
    }

}
    
