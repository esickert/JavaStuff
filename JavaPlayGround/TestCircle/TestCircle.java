import java.util.*;
import javax.swing.JFrame;

class TestCircle {

    public static void main(String[] args)  {
        int x = 3; 
        String name = null;;

        Circle tmp;          // creating an object reference variable      
        tmp = new Circle();  //initializing object tmp with constructor Circle()
        System.out.println("Initial value of name is " + name);
//        do  {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input a number: ");
        double num = userInput.nextDouble();
        //System.out.println(num);
        
        tmp.getNumber(num);
        System.out.println(tmp);
        System.out.println("******************");
        System.out.println("The area of a circle with radius " + num + " is " + tmp.findArea());
        System.out.println("The area of radius 1 is " + new Circle().findArea());
        x--;
//        }  while (x > 0);
/*        JFrame frame1 = new JFrame("It's alive");
//        frame1.setTitle("It's alive!!");
        frame1.setSize(300,200);
        frame1.setLocation(200,100);
        frame1.setVisible(true); */
    } // end of main

    TestCircle()    {
    }

} // end of class
