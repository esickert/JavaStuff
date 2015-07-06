import java.util.*;

public class TestStringClasses  {

    public static void main(String[] args)  {

    Character character  = new Character('q');
    ArrayList<String> a = new ArrayList<String>(5);
    System.out.println(character);
    boolean b = character.isDigit('m');
    System.out.println(a);

/********************************************************************/
/** StringBuffer class...very cool!!      **/
    StringBuffer me = new StringBuffer(0);
    me.append("talk about an easy way to reverse a string");
    System.out.println(me);
    me.reverse();
    System.out.println(me); //talk about an easy way to reverse a string

    for(int i = 0; i <= 5; i++) {
        a.add(i, "Hello there!");
    }
    for(int i = 0; i <= 5; i++) {
        System.out.println(a.get(i));
    }
/**********************************************************************/    
/** Need to understand StringBuffer better!!!!!!!!!!!   **/
    StringBuffer test = new StringBuffer("palindrone");
    StringBuffer erich = test;
    System.out.println(erich);
    StringBuffer tester = new StringBuffer("tetet");
    boolean isPalindrone = tester.equals(erich);
    System.out.println("Is ***" + tester + " a palindrone??:" + isPalindrone);

/**********************************************************************/
/** StringTokenizer class **/




    }
}
