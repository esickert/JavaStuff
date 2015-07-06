import java.util.*;

public class ArrayListAndStuff  {

    public static void main(String[] args)  {

/**********************************************************************/    
/** ArrayList and how to use them  **/

    ArrayList<String> a = new ArrayList<String>(5);
    for(int i = 0; i <= 5; i++) {
        a.add(i, "Hello there!");
    }
    for(int i = 0; i <= 5; i++) {
        System.out.println(a.get(i));
    }
/**********************************************************************/
/** primitive data type char object wrapper Character class   **/

    Character character  = new Character('q');
    System.out.println(character);
    boolean b = character.isDigit(character);
    System.out.println(b);
/**********************************************************************/

    }
}
