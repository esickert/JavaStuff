public class Circle  {
    
    double radius = 1.0;
    String phrase = "";

    Circle()    {     // a constructor 
    } //end of constructor
    
    Circle(double newRadius)    {   
        radius = newRadius;     //this is just initializing????
    } //end of constructor

    /**return area of circle */
    double findArea()   {
        System.out.println("Hello there from findArea :-)");
        return radius = radius * 3.14159;
    } //end of method

    String printOut() {
         return "Inside printOut";   
    }

    public static void main(String[] args)  {

        double x = 2.0;
        
        Circle var = new Circle(x);
        System.out.println(var);
        var.radius = 5.0;
        System.out.println(new Circle().findArea());     //annonymous object!!!!!
        System.out.println(var.printOut());
        var.phrase = "A new phrase";
        System.out.println(var.phrase);
        
        
    
    } // end of main

} // end of class Circle
