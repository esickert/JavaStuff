class Circle {

    private double radius;
    double number;

    Circle()    { 
        radius = 1.0;
    }  //constructor

    Circle(double newRadius)    {
        radius = newRadius;
    }  //constructor

    public double findArea()  {
//        radius = newRadius;
        return radius * (radius * Math.PI);
    }  // end of method

    public double setNumber(double anumber)  {
        return number = anumber;
    }

    public double getNumber(double anumber)   {
        return number = anumber;
    } 

} // end of class
        
