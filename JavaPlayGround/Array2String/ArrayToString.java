public class ArrayToString  {
    
    String[] myArray = new String[5];
    String[][] myOtherArray = new String[2][3];

    ArrayToString() {
    }


    public void print2DArray(String[][] a)  {  
        for(int i = 0; i < a.length; i ++)  {
            System.out.println();
            for(int j = 0; j < a[i].length; j++)    {
                System.out.println(a[i][j]);
            }
        }
    }

}
    
