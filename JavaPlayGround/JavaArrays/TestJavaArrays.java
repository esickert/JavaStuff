import java.util.*;

public class TestJavaArrays {
    public static void main(String[] args)  {
        String[] test = new String[5];   //null pointer exception trying to use
        int[][]  testArray2 = new int[4][5];  //local array being passed to class JavaArray

        JavaArrays myStuff = new JavaArrays(testArray2); //array being passed to class JavaArrays 

//        System.out.println();
        myStuff.loadArray(); //all the values in the 2D array need to be different
//        myStuff.printArray();
        System.out.println("this is using the array name " + test);
//        myStuff.printString(test);
        
        String str = Arrays.toString(test);      //using toString to convert an Array!!!!
        System.out.println("this is using toString()  " + str);
        
/** This prints out a toString representation of a 2D array!!! YAAAA!!! **/     
        for(int i = 0; i <= testArray2.length - 1; i++)   { 
            str = Arrays.toString(testArray2[i]); //problem here was i was printing the toString multiple
            System.out.println(str);              // times with another loop.
        }
            
    }
}
