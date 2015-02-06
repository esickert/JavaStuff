//types are int, double, string, char

//TYPE[] NAME_OF_ARRAY = new TYPE[LENGTH_OF_ARRAY]

//int[] example = new int[5];



public class arrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] values = new int[5];
        System.out.println(values[0]);
        values[0] = 5;

        System.out.println(values[0]);
        
        values = new int[10];
        System.out.println(values[0]);
        method(values);
    }
    
    public static void method(int[] someArray) {
    
    }
}
