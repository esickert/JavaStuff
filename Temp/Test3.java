public class Test3 {
    public static void main(String[] args) {
        
        int N = 3;
        String str = "Mississippi";
        String newStr = "";
               
        int max = 0;  //used in conditional statement
        int num1 = 12;
        int num2 = 13;
        int num3 = 5;
        
        int[] arrayStuff = new int[10];
        int[] stuff = new int[10]; 
        
        TestMe a = new TestMe(str);
        a.printMe(str);
        a.printMeToo();
        a.print3rd(str,N);
        a.userInput();
        a.conditionalStatement(num1,num2,num3);
        
/***********************************************************************/        
/**   Example of a Conditional Statement                              **/       
/***********************************************************************/        
        
/***********************************************************************/
        for(int i = 0; i <= arrayStuff.length -1; i++) {
            arrayStuff[i] = i;
        }
/***********************************************************************/
/**   Example of -NEW- for loop                                       **/
/***********************************************************************/                                       
//        for(int i: arrayStuff)  {
//        System.out.print(" " + arrayStuff[i]);
//        }                                                             
        a.printNewTypeArray(arrayStuff);
        
/***********************************************************************/
        System.out.println();
        
        for(int i = 0; i <= stuff.length - 1; ++i)	{
			stuff[i] = i;
            System.out.print(stuff[i]);
		}
        System.out.println();


    }
}
        
