public class Test2  {
    public static void main(String[] args)  {
    
    int a = 5; 
    int b = 2;
    int c = 6;
        
    if ((a <= b) && (b <= c))
        System.out.println( c);
    else if ((a <= b) && (c <= b))
        System.out.println( b);
    else 
        System.out.println( a);
        
    }
}
