public class TestJavaArrays {
    public static void main(String[] args)  {

        JavaArrays myStuff = new JavaArrays();

        for(int i = 0; i < 10; i++) {                             
        myStuff.myArray[i] = i;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(myStuff.myArray[i] + " ");
        }
        System.out.println();
    }
}
