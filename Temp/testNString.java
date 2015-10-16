/** Given a non-empty string and an int N, return the string made starting
with char 0, and then every Nth char of the string. So if N is 3, use 
char 0, 3, 6, ... and so on. N is 1 or more. 

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"                                        **/

public class testNString    {
    public static void main(String[] args)  {
//                                                                Mo Mou
        int N = 2;
        String str = "abcdefg";
        String newString = "";
//        System.out.println(str.substring(3));  //only one index prints the string starting at that index
        
//        while (x <= str.length())
            for(int i = 0; i <= str.length(); i = i + N){
                newString = newString + str.charAt(i);
//            for(int j = 1; j<= N; j++) {
//                newString = newString + str.substring(j,j+1);
//                System.out.println(newString);}
           System.out.println(newString);
            }
    }
}
