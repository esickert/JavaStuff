class Circle2   {
    
    private double newRadius;
    private int[] myArray; 

    Circle2()   {
    }

    Circle2(double radius)   {
        newRadius = radius;
    }

    Circle2(int[] scores)   {
    
    }

    public double get() {
        return newRadius;
    }

    public void set(double radius) {
        newRadius = radius;
    }

    public double circleArea()    {
        double area = newRadius * (newRadius * Math.PI);
        return area;
    }

}
