import java.util.*;

public class test2  {
    
    double a,b,c,d,e,f,g,h,i;
    
    double[][] payScaleTable = {{a, b, c},
                                {d, e, f},
                                {g, h, i}}
                                ;

    test2() {    //this is a constructor 
    }
    
    test2(double[][] a)   {
        payScaleTable = a;
    }

    public void printMe(String me)    {
        System.out.println (me);
    }
    
//    public double rate(int a, int b)    {
//        return payScaleTable[a][b];
//    }

    public String printArray(String[][] a)  {
        String result = Arrays.deepToString(a);
        return result;
    }


}
