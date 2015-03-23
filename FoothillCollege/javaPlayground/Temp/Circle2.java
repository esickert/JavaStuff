public class Circle2    {

    class TestCircle {   //DONT UNDERSTAND WHY ITS STATIC HERE!!!
        double radius;
        double pi = 3.14159;

        TestCircle()   {
        }

        TestCircle(double newRadius)  {
        radius = newRadius; 
        }

        double theArea()    {
            return radius = radius * pi;
        }
    } //end of class TestCircle

    public static void main(String[] args) {

        TestCircle circle1 = new TestCircle(5);
        System.out.println("The radius of circle1 is " + circle1.radius);
        System.out.println("The area of circle1 is " + circle1.theArea());

        TestCircle circle2 = new TestCircle(1);
        System.out.println("The radius of circle2 is " + circle2.radius);
        System.out.println("The area of circle2 is " + circle2.theArea());

    } // end of main

} //end of class Circle2
    
        
