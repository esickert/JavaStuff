import java.util.*;

public class TestCircle {
    /** Main Method  */
    public static void main(String[] args)  {
          int n = 2;
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Please input a radius value: ");
//        int n = userInput.nextInt();
        /** Create a cicle with radius n */
        Circle myCircle;
        myCircle = new Circle(n);
        Circle anotherCircle = new Circle();
        Square newSquare = new Square(n);
/*        System.out.println("A new square is side " + n);
        System.out.println("The area of square with side " + n + " is " + newSquare.areaSquare());
        anotherCircle.setRadius(1.0);
        System.out.println(n);
        System.out.println("A radius of myCircle is " + myCircle.getRadius());
        System.out.println("The area of myCircle with radius " + n  + " is " + myCircle.findArea() );
        printCircle(myCircle);
        printArea(myCircle, n);
        printArea(anotherCircle, 3);
        System.out.println("The number of object instances is " + Circle.getNumberOfObjects());

        /**       example of the this keyword  
        System.out.println("Using the this keyword returns i as " + newSquare.setI(1));
/***********************************************************************/
        Circle[] arrayOfCircles = new Circle[10];
//        for (int i = 0; i < arrayOfCircles.length; i++)  {
//            arrayOfCircles[i] = new Circle();
//        }
        for (int i = 0; i < arrayOfCircles.length; i++)  {
            System.out.println(arrayOfCircles[i]);
        }

    }

    /** passing an object by value  */
    public static void printCircle(Circle c)    {
        System.out.println("The area of a circle of radius " 
            + c.getRadius() + " is " 
            + c.findArea());
    }

    public static void printArea(Circle c, int times)   {
        System.out.println("Radius \t\tArea");
        while (times >= 1)  {
            System.out.println(c.getRadius() + "\t\t"
            + c.findArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
