import java.util.Scanner;

public class IfStatement  {
    public static void main(String args[])  {
    
    int x = 3;
    int y = 0;
    int i;
    boolean even;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter your grade: ");
    x = keyboard.nextInt();
    System.out.println("You entered integer " + x);
        
    //it's "if" not "if...do"  if...do  is WRONG!!! WRONG
   /* if (x > 3)
   //     if (x == 4)   //use "==" not "="  "=" is the assignment operator!!!  
            System.out.print("x is 4\n");
        else
            System.out.println("NOT 4!!\n");
    else
        System.out.print("You fucked up\n"); 
        
    boolean b = true;
    i = (int)b;  
    System.out.println(i);  */
    System.out.println("Im here");
    if (x >= 60)
        System.out.println("D");  //it never tests the other grades because the first if is satisfied!!
    else if (x >= 70)
        System.out.println("C");
    else if (x >= 80)
        System.out.println("B");
    else if (x >= 90)
        System.out.println("A");
    else
        System.out.println("F");
        
   /*  if (x >= 90)
        System.out.print("D");
    else if (x >= 80)
        System.out.println("C");
    else if (x >= 70)
        System.out.println("B");
    else if (x >= 60)
        System.out.println("A");
    else
        System.out.println("F");*/
    }
}
