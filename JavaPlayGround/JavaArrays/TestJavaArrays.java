import java.util.*;

public class TestJavaArrays {
    public static void main(String[] args)  {

        int[] test = new int[6];
        String[][]  testArray2 = new String[2][3];  //local array being passed to class JavaArray

        JavaArrays myStuff = new JavaArrays(testArray2); //array being passed to class JavaArrays 

        for(int i = 0; i <= test.length -1; i++) {
            System.out.println();
            for(int j = 0; j <= test.length - 1; j++)   {
                test[i] = 2;
//                System.out.print(test[i]);
            }
            System.out.println();
        }
        
        System.out.println();
        myStuff.loadArray("   2D Array Dude ");
        myStuff.printArray();
        System.out.println("this is using the array name " + test);
//        myStuff.printString(test);
        
        String str = Arrays.toString(test);    //using toString to convert an Array!!!!
        System.out.println("this is using toString()  " + str);
    }
}
