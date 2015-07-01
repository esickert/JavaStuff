public class TestJavaArrays {
    public static void main(String[] args)  {

        String[][]  testArray2 = new String[2][3]; 
        JavaArrays myStuff = new JavaArrays(testArray2);  //local array being passed to class JavaArray

        System.out.println();
        myStuff.loadArray("2D Array Dude");
        myStuff.printArray();
    }
}
