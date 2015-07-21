public class ArrayToString  {
    
    private double[] myArray = new double[5];
    private double[][] myOtherArray = new double[2][3];

    ArrayToString() {
    }
    
    ArrayToString(double[] a)   {
        myArray = a;
    }

    ArrayToString(double[][] a) {
        myOtherArray = a;
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
                System.out.println(a[i][j]);
            }
        }
    }

}
    
