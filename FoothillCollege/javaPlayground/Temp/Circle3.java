public class Circle3 {

    private double radius;

//** constructor
    Circle3()    {
        radius = 1.0;
    } //end of constructor

//** constructor
    Circle3(double newRadius)    {
        radius = newRadius;
    } //end of constructor

//** return radius
    public double getRadius()   {
        return radius;
    }

//** set a new radius
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

//** Return the area of this circle
    public double findArea()    {
        return radius * radius * 3.14159;
    } // end of method findArea
} // end of class


