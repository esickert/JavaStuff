public class Circle  {
    
    double radius = 1.0;
    String phrase = "";

    Circle()    {     // a constructor 
    } //end of constructor
    
    Circle(double newRadius)    {   
        radius = newRadius;     //this is just initializing????
    } //end of constructor

    double getRadius()  {
        return radius;
    }

 //   setRadius() {
        

    /**return area of circle */
    double findArea()   {
//        System.out.println("Hello there from findArea :-)");
        return radius = radius * 3.14159;
    } //end of method

    String printOut() {
         return "Inside printOut";   
    }

    public static void main(String[] args)  {

        double x = 2.0;
        
        Circle a = new Circle(x);
        System.out.println(a);
        a.radius = 5.0;
        System.out.println(new Circle().findArea());     //annonymous object!!!!! Temporally created then destroyed
        System.out.println(a.printOut());
        a.phrase = "A new phrase";       // phrase is a String variable
        System.out.println(a.phrase);     // a is a object of circle
        
        
    
    } // end of main

} // end of class Circle
