import java.util.*;

public class ArrayToString  {
    
    double a,b,c,d,e,f,g,h,i;
    
    double[][] payScaleTable = {{a, b, c},
                                {d, e, f},
                                {g, h, i}}
                                ;

    ArrayToString() {
    }
    
    ArrayToString(double[][] a)   {
        payScaleTable = a;
    }

    public String convertArrayToString(double[][] a)  {
        String stuff1 = Arrays.deepToString(a);
        return stuff1;
    }
    
    String stuff1 = Arrays.toString(payScaleTable);
    
    public void print2DArray(double[][] a)    {
        for(int i = 0; i < a.length; i++)   {
            System.out.println();
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }

}
    
