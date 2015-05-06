public class TestCircle2    {
    public static void main(String[] args)  {

        int n = 2;
        Circle2 temp;
        temp = new Circle2(5);
        Circle2 temp2 = new Circle2(4);
    
        System.out.println(temp.circleArea());
        System.out.println("temp is " + temp.get());
        System.out.println("Now changing temp radius to " + n);
        temp.set(n);
        System.out.println("temp is " + temp.get());
        System.out.println("temp2 radius is " + temp2.get());
        System.out.println(temp.circleArea());
    }
}
