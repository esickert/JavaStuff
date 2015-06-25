public class PlayJava   {

    private String temp;
    String[][] myArray = {
		{"A1", "A2", "A3"},
		{"B1", "B2", "B3"},
		{"C1", "C2", "C3"}
	};
	String[] myOtherArray = new String[10];  //this array length is not declared.
	
    PlayJava()  {
    }

    PlayJava(String newString)  {
        temp = newString;
    }

    public void printString()   {   
        System.out.println(temp);
    }

    public String Reverse(String temp) {
        char[] characters = temp.toCharArray();
        char[] charReverse = new char[temp.length()];
        for(int i = characters.length - 1; 0 <= i; i--) {
            charReverse[(characters.length -1) - i] = characters[i];
            //System.out.print(charReverse[(characters.length -1) - i] + "1");
        }
        //System.out.println();
        String reverseChar = new String(charReverse);
        return  reverseChar;
    }

    public void put(String str)  {
        temp = str;
    }

    public String get() {
        return temp;
    }

}
        
