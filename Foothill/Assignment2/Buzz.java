 public class Buzz {
          public static void main(String[] args) {
                    zippo("rattle", 13);
          }          
 
          public static void baffle(String blimp) {
             /*3*/  System.out.println(blimp);
                    zippo("ping", 5);
          }
 
          public static void zippo(String quince, int flag) {
         /*1*/  /*4*/ if (flag < 0) {
                /*5*/         System.out.println(quince + " zoop");
                    } else {
                 /*2*/        System.out.println("ik");
                              baffle(quince);
                 /*6*/        System.out.println("boo-wa-ha-ha");
                    }
          }
}
 
/*1. Write the number 1 next to the first statement of this program that
will be executed. Be careful to distinguish things that are statements
from things that are not.
 
2. Write the number 2 next to the second statement, and so on until the
end of the program. If a statement is executed more than once, it might
end up with more than one number next to it.
 
3. What is the value of the parameter blimp when baffle gets invoked?   "rattle"
 
4. What is the output of this program?    

ik
rattle
ping zoop
boo-wa-ha-ha
*/
