import java.util.*;

public class RunTest    {
    
    public static void main(String[] args)  {
        ArrayList mine = new ArrayList();
        ArrayList mine2 = new ArrayList();
        int[] num = new int[10];  //this creates the reference variable and initializes it (allocates memory).  
        int[] num2 = {3,5,2,3,5,5,5};   //this creates the reference variable num2
        Test a = new Test(3);
    
//        System.out.println(a.radius);
//        System.out.println(a.findArea());
        
        mine.add("hi");
        mine.add("there");
        mine.add(2);
        mine.add(3.33);
        mine.add(false);
//        System.out.println(mine);
        int temp = num2[0];
        for(int i = 1; i <= num2.length -1; i++) {
            if (temp < num2[i]) {
                temp = num2[i];
                System.out.print(temp + " "); //this only prints is temp < num2[i]
            }
        }
        int count = 0;
        for (int i = 0; i < num2.length; i++)
            if (num2[i] == temp)
                count++;
        
        System.out.println("There are " + count + " occurances of " + temp);

    }
}
