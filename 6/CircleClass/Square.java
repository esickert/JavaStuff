public class Square {

    int side;
    int i = 500;

    Square()    {
    }
    
    Square(int newSide) {
        side = newSide;
    }

    public int areaSquare()   {
        return side = side * side;
    }

    public int getSide()    {
        return side;
    }

    public int setI(int i)   {
        this.i = 2;                      //example of using this keyword
        System.out.println("Inside setI. i is " + i);
        return this.i;
    }
        

}


