import java.util.*;

public class TestJavaArrays {
    public static void main(String[] args)  {

        String[] test = new String[5];   //null pointer exception trying to use
        String[][]  testArray2 = new String[3][2];  //local array being passed to class JavaArray

        JavaArrays myStuff = new JavaArrays(testArray2); //array being passed to class JavaArrays 

/*        for(int i = 0; i <= test.length -1; i++) {
            System.out.println();
            for(int j = 0; j <= test.length - 1; j++)   {
                test[i] = 2;
//                System.out.print(test[i]);
            }
            System.out.println();
        }  */
        
        System.out.println();
        myStuff.loadArray(" class JavaArrays ");
//        myStuff.printArray();
//        System.out.println("this is using the array name " + test);
//        myStuff.printString(test);
        
        String str = Arrays.toString(test);    //using toString to convert an Array!!!!
        System.out.println("this is using toString()  " + str);
        
/** This prints out a toString representation of a 2D array!!! YAAAA!!! BUT THE ARRAY COUNT IS WRONG  **/     
        for(int i = 0; i <= 3 - 1; i++)   { 
            for(int j = 0; j <= testArray2[i].length - 1; j++)   {
                str = Arrays.toString(testArray2[i]);  
                System.out.println(str);
//                System.out.println("count");
            }
        }
            
    }
}
