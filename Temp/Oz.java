/**Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only
if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
**/
public class Oz {
    public static void main(String[] args)  {
    
    String str = "";
        
    startOz(str);
    
    }
    
    public static void startOz(String str)   {
    
        if (str.substring(0,2).equals("oz")) 
            System.out.println(str.substring(0,2));
        else if ((str.substring(1,2).equals("z"))&&(!(str.substring(0,1).equals("o"))))
            System.out.println("z");
        else if ((str.substring(0,1).equals("o"))&&(!(str.substring(1,2).equals("z"))))
            System.out.println("o");
        else System.out.println("");
    }
    
}
